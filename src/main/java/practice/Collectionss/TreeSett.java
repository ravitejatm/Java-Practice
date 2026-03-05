package practice.Collectionss;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSett {

    static void main(String[] args) {

       // assending order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(15);
        ts.add(24);
        ts.add(5);
        ts.add(32);
        ts.add(55);
        ts.add(6);
        ts.add(9);
        ts.add(8);



        //stored based on hashcode
        System.out.println(ts);

        System.out.println(ts.remove(85)); //85 is data

        System.out.println(ts.contains(5));
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());

        //additional operations
        System.out.println(ts.first()); //lowest element
        System.out.println(ts.last()); //highest element
        System.out.println(ts.pollFirst()); //remove first element
        System.out.println(ts.pollLast()); //remove last element
        System.out.println(ts.subSet(5, 55)); // create new set
        System.out.println(ts.descendingSet()); //decending order

        //to retrive need to use for each

        for (Integer i : ts) {
            System.out.println(i);
        }



    }
}
