package practice.Collectionss;

import java.util.*;

public class Linkedlistt {

    static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("red");
        list3.add("blue");
        list3.add("green");


        //previousnode
        //item               3.object
        //nextnode


        list2.add("green");
        list2.add("blue");
        list2.add("red");
        list2.add(2,"orange");
        list2.add("orange");

        list2.set(1,"orange"); //update

      //  list2.add(list3);
        //list2.add(, list3);
        //list2.removeall()
        list2.remove("orange");  //delete

        System.out.println(list2.get(3));   //get
        System.out.println(list2.contains("red"));











    }
}
