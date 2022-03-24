package hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        map.put(3,11);
        map.put(1,12);
        map.put(5,23);
        map.put(2,22);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());

        }

        System.out.println("--------------");
        Map<Integer,Integer> map1=new HashMap<>();
        map1.put(3,11);
        map1.put(1,12);
        map1.put(5,23);
        map1.put(2,22);

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
