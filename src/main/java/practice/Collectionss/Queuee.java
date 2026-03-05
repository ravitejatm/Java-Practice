package practice.Collectionss;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

    static void main(String[] args) {
       //PriorityQueue
        //internally uses array
        //head-0(integer lowest value have higher priority)
        //tail-11

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder()); //for higher value in header possition.



        //addition : offer, add
        //retrive : peek
        //remove: poll, remove
        queue.offer(1);
        queue.offer(2);
        queue.offer(10);
        queue.offer(24);
        queue.add(3);
        //queue.clear();

        System.out.println(queue);
        System.out.println(queue.peek()); // get head value
        System.out.println(queue.poll()); //remove only head value
        // if using poll in empty queue gets null
        //if using remove get nosuchelement exception
        System.out.println(queue.contains(10));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
