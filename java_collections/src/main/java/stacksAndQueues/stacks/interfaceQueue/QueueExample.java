package stacksAndQueues.stacks.interfaceQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Number> queue = new LinkedList<>();

        for (int i = 0; i<10; i++){
            queue.add(i);
        }

        System.out.println("Los elementos de la cola son: " + queue);

        System.out.println("---- recorremos la cola para obtener los heads ----");
        System.out.println("===================================================");
        while (!queue.isEmpty()){
            Number head = queue.remove();
            System.out.println("obtenemos el head de la cola: " + head);
            System.out.println("Los elementos de la cola son: " + queue);
        }
        System.out.println("===================================================");
    }
}
