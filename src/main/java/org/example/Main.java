package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSearch s = new FileSearch();

        s.putFile("/data/pics/photoA.jpg", 4);
        s.putFile("/data/pics/movie.mp4", 12);
        s.putFile("/work/docs/readme.md", 1);
        s.putFile("/work/docs/report.xml", 7);

        s.putFile("/data/pics/photoA.jpg", 9);

        List<String> res1=s.search(1, "/data", "8");
        printList(res1);
        List<String> res2= s.search(2, "/work", ".xml");
        printList(res2);
    }
    private static void printList(List<String> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}