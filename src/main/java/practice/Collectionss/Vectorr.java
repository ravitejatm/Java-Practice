package practice.Collectionss;

import java.util.Arrays;
import java.util.Vector;


public class Vectorr {
    static void main(String[] args) {
        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("e");
        v.add("f");
        v.add("f");
        v.add("f");
        v.add(0, "aa");

        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.indexOf("f"));
        System.out.println(v.lastIndexOf("f"));

        Vector v2 = new Vector();
        v2.add("a");
        v2.add("b");
        v2.add("c");
        v2.add("d");
        v2.add("e");
        v2.add(null);


        System.out.println(v2);
// adding v2 to v //using this taking extra time and space
        for (int i = 0; i < v.size(); i++) {
            v.add(v2.get(i));
        }
        System.out.println(v);
    v.addAll(v2);
    v.addAll(0,v2);
    //retrive
    System.out.println(v.get(2));
//adding
        v.add("dcdcdd");

//remove
    v.remove(2);
    //v.removeAll(v2);
     //v.clear(); //remove entire list
// verification
     System.out.println(v.contains("a")); //true or false
     System.out.println(v.contains("b"));
     System.out.println(v.contains("c"));
     System.out.println(v.containsAll(v2);
     System.out.println(v.indexOf("c"));
     System.out.println(v.lastIndexOf("f"));
     System.out.println(v.firstElement());
     System.out.println(v.lastElement());

//update
     v.set(3,"cc");
     System.out.println(v);


        //list to array
//     Object[] arr = v.toArray();
//     System.out.println(Arrays.toString(arr));

        //array to list
//        Object[] arr = new Object[] {1,2,3,4,5,6,7,8,9};
//        Vector v3 = new Vector(Arrays.asList(arr));
//        System.out.println(v3);


        //Vector<Integer> v1 = new Vector<>(); // it only take integer value.
        //v1.add(12);


    }
}
