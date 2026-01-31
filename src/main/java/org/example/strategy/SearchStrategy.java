package org.example.strategy;

import org.example.FileEntry;

import java.util.List;
import java.util.Map;

public interface SearchStrategy {
     List<String> search(String dirPath, String args, Map<String, FileEntry> files);
}
