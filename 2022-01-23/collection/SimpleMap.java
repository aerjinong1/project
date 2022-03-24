package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 在map当中，key是不能重复的，value是可以重复的
 */
public class SimpleMap {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("a", "b");
//        map.put("d", "b");
//        map.put("q", "b");
//        map.put("y", "b");
//        System.out.println(map);
//        String val = map.get("d");
//        System.out.println(val);
//        String val2 = map.get("aaaa");
//        System.out.println(val2);
//        map.put("a", "abc");
//        System.out.println(map);
//        //获取map的所以元素：
//        for (String key : map.keySet()) {
//            System.out.println(map.get(key));
//        }
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+entry.getValue());
//        }


        String key1 = "a";
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = map1;
        map1.put(key1, 123);
        String a = new String("a");
        System.out.println(map1.get(a));

        System.out.println(key1 == a);
        //
        /**
         * 正确使用Map的保证：
         * 1、作为key的对象必须正确重写equals方法
         * 2、作为key的对象，还必须保证正确重写hashcode方法，且需要遵循如下原则：
         *      （1）、如果两个对象通过equals方法比较得出相等结果，则hashcode必须相等
         *      （2）、如果两个对象通过equals方法比较得出不相等结果，则两个对象的hashcode尽可能不相等
         */
        System.out.println(key1.equals(a));


        System.out.println(map1 == map2);

//        Integer integer = 129;
//        Integer integer1 = 129;
//        System.out.println(integer==integer1);
    }
}
