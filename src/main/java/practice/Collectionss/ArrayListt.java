package practice.Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(1,22);
        System.out.println(al);
        System.out.println(al.size());

        Integer[] arr = new Integer[] {1,2,3,4,5,6};
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al2);
    //retrive
    System.out.println(al2.get(2));
    //deletion
        al2.remove(2);
    //verification
    System.out.println(al2.contains(2));
    //update
        al2.set(2, 33);
        System.out.println(al2);
    al2.add(null);
    System.out.println(al2);

    for (Integer i : al2) {
        System.out.println(i);
    }
    //explictly synchronising
      //  Collections.synchronizedList(al2);

    }
}
