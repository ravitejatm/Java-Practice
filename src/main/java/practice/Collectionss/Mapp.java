package practice.Collectionss;


import java.util.*;

public class Mapp {
     public static void main(String[] args) {

        //List<String> list = new Vector<>();
        Map<Integer, String> map = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        map.put(505505, "hydrabad"); // key and value
        map.put(505506, "Benglore");  // key should be unique
        map.put(505507, "hydrabad");
        map.put(505508, "Chennai");
        map.put(505509, null);
        map.put(null,null);

        //retrive of keys from the map
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);

        }

        // retrive of values from the map
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        //retive of value from the map based on key
        System.out.println(map.get(505505));


        // keys and values
        for(Integer key : keys){
            System.out.println(key  +" >>>>>>> " + map.get(key));
        }

        System.out.println(map);

        // deletion of element from map
        map.remove(505505); //key and value we can send , both also we can asend
        System.out.println(map);

        System.out.println(map.containsKey(505505));
        System.out.println(map.containsValue("Hyderabad"));

        //update value
        map.put(505505, "andhra");
        map.putIfAbsent(505505, "andhra"); //if present it wont update
        map.replace(505505, "mumbai");

        //total element
        System.out.println(map.size());
        //delete total
        //map.clear();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " >>>>>>> " + value);

        }

    }
}
