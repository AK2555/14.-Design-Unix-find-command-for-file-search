package org.example;

public class PathUtils {
    public static boolean isUnderDirectory(String dirPath,String filePath){
        String[] dirPathArr=dirPath.split("/");
        String[] filePathArr=filePath.split("/");
        int i=0;
        for(;i<dirPathArr.length && i<filePathArr.length;i++){
            if(!dirPathArr[i].equals(filePathArr[i])){
                return false;
            }
        }
        if(i==dirPathArr.length){
            return true;
        }
        return false;
    }
}
