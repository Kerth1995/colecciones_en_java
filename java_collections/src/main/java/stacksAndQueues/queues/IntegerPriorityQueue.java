package stacksAndQueues.queues;

import java.util.PriorityQueue;

public class IntegerPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(500);
        queue.add(600);
        queue.add(400);
        queue.add(700);
        queue.add(300);

        System.out.println("Imprimimos la cola: " + queue);
        System.out.println("Imprimimos el elemento con mayor prioridad: " + queue.peek());
        System.out.println("Eliminamos el head o el elemento de mayor prioridad de la cola: " + queue.poll());
        System.out.println("Mostramos nuevamente la cola: " + queue);
    }
}
