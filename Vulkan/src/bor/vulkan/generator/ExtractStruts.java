/**
 * 
 */
package bor.vulkan.generator;

import java.util.*;
import static bor.vulkan.generator.Util.*;

/**
 * Import some methods of Extract Enum
 */

import static bor.vulkan.generator.Util.*;

public class ExtractStruts {
    
    private static final boolean saveFile = true;
    private static final boolean printID = false;
    private static final boolean printStruct = false;
    
   
    /**
     * Process Vulkan Structs
     * 
     * @param vkh - source
     * 
     * @return last struct ID
     */
    public static int processStructs(List<String> vkh) {
        System.out.println("Processing Structs.");
        //boolean printStructs = true;
        boolean exportStructs = true;
        boolean showAtConsole = false;

        int[] positions = { 0, 0 };
        int ID = 0;
        List<StructInfo> allStructs = new ArrayList<StructInfo>();
        List<String> nextStruct = null;
        // building structs
        while ((nextStruct = extractNextStruct(vkh, positions[1], positions)) != null) {
            ID++;
            // System.err.println("/** Structure #" + (++ID) + " */");
            StructInfo info = StructInfo.parse(nextStruct, ID);
            allStructs.add(info);
            // String foundEnum = toString(nextStruct);
            // System.err.println(foundEnum);
            // System.err.println(info);
        }// while

        System.out.println("All Struct :");
        if (showAtConsole) for (StructInfo info : allStructs) {
            System.out.println(info.toJavaSrc("bor.vulkan.structs"));
            System.out.println("__________________________________");
            // System.out.println("public static final int " + info.getID_NAME()+";");
        }
        
        if (printID) {
            System.out.println("All Struct ID:");
            for (StructInfo info : allStructs) {
                System.out.println(info.name + "\t" + info.id);
                // System.out.println("public static final int " +
                // info.getID_NAME()+";");
            }
        }
        
        // export
        if (exportStructs) {
            for (StructInfo info : allStructs) {
                String nameFile = info.name + ".java";
                boolean isKHR = info.name.endsWith("KHR");
                String pkg = isKHR ? "bor.vulkan.khr.structs" 
                                   : "bor.vulkan.structs";
                
                String basePath = isKHR ? "D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/khr/structs"
                                        : "D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/structs";

                
                String txt = info.toJavaSrc(pkg);
                if(saveFile){
                    System.out.println("Saving struct " + nameFile);
                    save(basePath, nameFile, txt);
                }
                if(printStruct){
                    System.out.println(txt);
                    System.out.println("____________________________________");
                }
            }
        }
        return ID;
    }// process struct
    
    
    
    /**
     * Process Vulkan Structs
     * 
     * @param vkh - source
     * @param ID - last ID used by Structs
     */
    public static int processUnions(List<String> vkh, int ID) {
        System.out.println("Processing Structs.");
        //boolean printStructs = true;
        boolean exportStructs = true;
        boolean showAtConsole = false;

        int[] positions = { 0, 0 };
        //int ID = 0;
        List<StructInfo> allStructs = new ArrayList<StructInfo>();
        List<String> nextStruct = null;
        // building structs
        while ((nextStruct = extractNextUnion(vkh, positions[1], positions)) != null) {
            ID++;
            // System.err.println("/** Union #" + (++ID) + " */");
            StructInfo info = StructInfo.parse(nextStruct, ID);
            allStructs.add(info);           
        }// while

        System.out.println("All Union :");
        if (showAtConsole) for (StructInfo info : allStructs) {
            System.out.println(info.toJavaSrc("bor.vulkan.structs"));
            System.out.println("______________________________________________________");           
        }
        if (printID) {
            System.out.println("All Union ID:");
            for (StructInfo info : allStructs) {
                System.out.println(info.name + "\t" + info.id);
                // System.out.println("public static final int " +
                // info.getID_NAME()+";");
            }
        }

        // export
        if (exportStructs) {
            for (StructInfo info : allStructs) {
                String nameFile = info.name + ".java";
                boolean isKHR = info.name.endsWith("KHR");
                String pkg = isKHR ? "bor.vulkan.khr.structs" : "bor.vulkan.structs";
                String basePath = isKHR ? "D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/khr/structs"
                        : "D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/structs";

                
                String txt = info.toJavaSrc(pkg);
                if(saveFile){
                    System.out.println("Saving union " + nameFile);
                    save(basePath, nameFile, txt);
                }
                if(printStruct){
                    System.out.println(txt);
                    System.out.println("___________________________________________________");
                }
            }
        }
        return ID;
    }// process unions

    /**
     * Search for structs
     * @param src - source, as the VkVulkan.h read as lines
     * @param pos - where to start to search
     * @param positions - current positions
     * @return struct definition as List<String>
     */
    public static List<String> extractNextStruct(List<String> src, int pos, int[] positions) {
        int start = findNextLineStartingWith(src, "typedef struct", pos);
        if (start < 0) return null;

        int end = findNextLine(src, "}", start);
        if (end < 0) throw new IllegalAccessError("Malformed struct");

        end += 1; // inclusive
        if (positions != null) {
            positions[0] = start;
            positions[1] = end;
        }
        return src.subList(start, end);
    }
    
    /**
     * Search for unions
     * @param src - source, as the VkVulkan.h read as lines
     * @param pos - where to start to search
     * @param positions - current positions
     * @return struct definition as List<String>
     */
    public static List<String> extractNextUnion(List<String> src, int pos, int[] positions) {
        int start = findNextLineStartingWith(src, "typedef union", pos);
        if (start < 0) return null;

        int end = findNextLine(src, "}", start);
        if (end < 0) throw new IllegalAccessError("Malformed union");

        end += 1; // inclusive
        if (positions != null) {
            positions[0] = start;
            positions[1] = end;
        }
        return src.subList(start, end);
    }

    /**
     * Do It !
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<String> vkh = readVKH();
        // String vk = toString(vkh);       
        boolean processStructs = true;

       
        if (processStructs) {
            int ID = processStructs(vkh);
          //  processUnions(vkh, ID);
        }

    }

}
