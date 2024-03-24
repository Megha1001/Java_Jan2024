package hashing.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("megha");
        h.add("verma");
        h.add("SE-II");

        System.out.println(h);
        System.out.println(h.contains("SE-II"));

        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
