package practice.Collectionss;

import java.util.HashSet;
import java.util.Set;

public class HashSett {

    static void main(String[] args) {

        Set<String> st = new HashSet<String>();

        HashSet<Integer> hs = new HashSet<>();

        //Hashset interally uses hashmap, and valuses stored as key but valuses will stores as dummy object.
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);


        //stored based on hashcode
        System.out.println(hs);

        System.out.println(hs.remove(85)); //85 is data

        System.out.println(hs.contains(5));
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        //to retrive need to use for each

        for (Integer i : hs) {
            System.out.println(i);
        }

    }
}
