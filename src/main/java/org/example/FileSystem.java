package org.example;

import org.example.strategy.SearchFileExtension;
import org.example.strategy.SearchStrategy;
import org.example.strategy.SearchStrictlyLarger;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileSystem {
    Map<String,FileEntry> files;
    private final Map<Integer,SearchStrategy> searchCriteria;

    public FileSystem(){
        this.files=new ConcurrentHashMap<>();
        this.searchCriteria=new ConcurrentHashMap<>();
        this.searchCriteria.put(1,new SearchStrictlyLarger());
        this.searchCriteria.put(2,new SearchFileExtension());
    }

    public void putFile(String path,int sizeMb){
        files.put(path,new FileEntry(path,sizeMb));
    }
    public List<String> search(int searchCriteriaId,String dirPath,String args){
        SearchStrategy strategy=searchCriteria.get(searchCriteriaId);
        return strategy.search(dirPath,args,this.files);
    }
}
