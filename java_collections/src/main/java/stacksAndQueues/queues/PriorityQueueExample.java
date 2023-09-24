package stacksAndQueues.queues;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Number> queue = new PriorityQueue<>();
        // input values are [50,60,40,70,30,80,20,90,10,100,1]
        queue.add(50);
        queue.add(60);
        queue.add(40);
        queue.add(70);
        queue.add(30);
        queue.add(80);
        queue.add(20);
        queue.add(90);
        queue.add(10);
        queue.add(100);
        queue.add(1);
        System.out.println("Los valor de la cola son: " + queue);
        PriorityQueue<Number> queue2 = new PriorityQueue<>();
        // input values are [6,9,8,1,5,6,0,11,10,4]
        queue2.add(6);
        queue2.add(9);
        queue2.add(8);
        queue2.add(1);
        queue2.add(5);
        queue2.add(6);
        queue2.add(0);
        queue2.add(11);
        queue2.add(10);
        queue2.add(4);

        System.out.println("Los valor de la cola son: " + queue2);
    }
}
