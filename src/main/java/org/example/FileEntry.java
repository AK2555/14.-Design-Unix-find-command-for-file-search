package org.example;

public class FileEntry {
    private String path;
    private int sizeMb;
    public FileEntry(String path,int sizeMb){
         this.path=path;
         this.sizeMb=sizeMb;
    }

    public int getSizeMb() {
        return sizeMb;
    }
}
