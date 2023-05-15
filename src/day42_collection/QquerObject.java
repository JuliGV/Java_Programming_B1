package day42_collection;

import java.util.PriorityQueue;

public class QquerObject {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);// List, Set
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        //queue.add(null); PriorityQueue does NOT accept  null value
        System.out.println(queue);

        //queue.get(8); we can NOT, because get method in the List Interface

        queue.offer(30);// specific for the PriorityQueue
        System.out.println(queue);

    }
}
