package org.example.strategy;

import org.example.FileEntry;
import org.example.PathUtils;

import java.util.*;

public class SearchStrictlyLarger implements SearchStrategy{
    @Override
    public List<String> search(String dirPath, String args, Map<String, FileEntry> files) {
        List<String> res=new ArrayList<>();
        for(Map.Entry<String,FileEntry> me:files.entrySet()){
            String key=me.getKey();
             FileEntry value=me.getValue();
            if(PathUtils.isUnderDirectory(dirPath,key)){
                if(value.getSizeMb()>Integer.parseInt(args)){
                    res.add(key);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
