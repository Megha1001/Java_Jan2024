package hashing.hashMap;

import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();

        h.put("Megha",1);
        h.put("verma", 2);
        h.put("dsa",3);

        System.out.println(h);
        System.out.println(h.size());

        for(Map.Entry<String, Integer> e : h.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

        System.out.println(h.containsKey("Megha"));
        System.out.println(h.containsKey("NotPresent"));
        System.out.println(h.containsValue(1));
        System.out.println(h.containsValue(0));
        System.out.println(h.get("Megha"));

        System.out.println(h.remove("dsa"));
        System.out.println(h.remove("temp"));

    }
}
