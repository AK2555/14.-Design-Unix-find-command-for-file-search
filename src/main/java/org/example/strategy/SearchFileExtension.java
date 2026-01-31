package org.example.strategy;

import org.example.FileEntry;
import org.example.PathUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SearchFileExtension implements SearchStrategy{
    @Override
    public List<String> search(String dirPath, String args, Map<String, FileEntry> files) {
        List<String> res=new ArrayList<>();
        for(Map.Entry<String,FileEntry> me:files.entrySet()){
            String key=me.getKey();
           // FileEntry value=me.getValue();
            if(PathUtils.isUnderDirectory(dirPath,key)){
                if(contains(key,args)){
                    res.add(key);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
    private boolean contains(String str,String pat){
       if(pat.length()>=str.length()){
           return false;
       }
        return str.substring(str.length()-pat.length()).equals(pat);
    }
}
