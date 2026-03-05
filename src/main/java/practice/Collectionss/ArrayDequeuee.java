package practice.Collectionss;

import java.util.ArrayDeque;

public class ArrayDequeuee {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("a");
        arrayDeque.offer("b");
        arrayDeque.add("c");
        arrayDeque.addFirst("apple");
        arrayDeque.offerLast("kiwi");
        arrayDeque.offerFirst("banana");
        System.out.println(arrayDeque);

        //adding:  offer, offerFirst, offerLast, addfirst, addLast
        //retrive: peek, peekFirst, peekLast
        //remove: poll, pollFirst, pollLast, removeFirst, removeLast.

    }
}
