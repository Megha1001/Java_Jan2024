package hashing.hashSet;

import java.util.HashSet;

public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("megha");
        h.add("verma");
        h.add("SE-II");

        System.out.println(h.size());
        System.out.println(h.contains("SE-II"));

        for(String s : h){
            System.out.println(s+" ");
        }

        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());
    }
}
