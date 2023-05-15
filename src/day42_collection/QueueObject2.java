package day42_collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObject2 {
    public static void main(String[] args) {
        PriorityQueue <String> queue = new PriorityQueue<>();

        //insertion order not reserve but natural
        queue.offer("hello");
        queue.offer("word");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("api");
        queue.offer("dataBase");


        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
        // it remove first one, but sometimes no )

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("hello");
        arrayDeque.offer("word");
        arrayDeque.offer("java");
        arrayDeque.offer("selenium");
        arrayDeque.offer("apple");
        arrayDeque.offer("api");
        arrayDeque.offer("dataBase");

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll()); // removing the element first element

        System.out.println(arrayDeque.peek());// first element
        System.out.println(arrayDeque.peekLast()); //last element

        arrayDeque.offerFirst("new one");
        System.out.println(arrayDeque);


    }
}
