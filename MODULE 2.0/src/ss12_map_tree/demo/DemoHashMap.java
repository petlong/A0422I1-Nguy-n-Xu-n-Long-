package ss12_map_tree.demo;

import java.util.*;



public class DemoHashMap {
    public static void main(String[] args) {
//        Map<Integer, String> stringMap = new HashMap<>();
//        Map<Integer, String> stringMap = new LinkedHashMap<>();
        Map<Integer, String> stringMap = new TreeMap<>();
        stringMap.put(3, "Ho Chi Minh");
        stringMap.put(4, "Can Tho");
        stringMap.put(1, "Da Nang");
        stringMap.put(2, "Ha Noi");

        Set<Map.Entry<Integer, String>> entries = stringMap.entrySet();
        for (Map.Entry entry: entries) {
            System.out.println("Key: " + entry.getKey()
                + "| Value: " + entry.getValue());
        }

        Set<Integer> integers = stringMap.keySet();
        for (Integer integer: integers) {
            System.out.println("Key: " + integer
                    + "| Value: " + stringMap.get(integer));
        }

        Collection<String> strings = stringMap.values();
        for (String s: strings) {
            System.out.println("Value: " + s);
        }

        System.out.println(stringMap.get(2));
        stringMap.remove(4);

        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 20);
        customers.put("Hike", 58);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
