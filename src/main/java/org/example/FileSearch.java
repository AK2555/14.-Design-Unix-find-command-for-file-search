package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileSearch {

    FileSystem fileSystem;

    public FileSearch() {
       fileSystem=new FileSystem();
    }

    public void putFile(String path, int sizeMb) {
        fileSystem.putFile(path,sizeMb);
    }

    public List<String> search(int ruleId, String dirPath, String args) {
        return fileSystem.search(ruleId,dirPath,args);
    }
}
