package stacksAndQueues.queues;

import javax.management.Query;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Java");
        queue.add("Pascal");
        queue.add("Cobol");
        queue.add("C");
        queue.add("C++");
        queue.add("Type Script");
        queue.add("Python");
        queue.add("C#");

        System.out.println("Mostramos el elemento con mayor prioridad: " + queue.peek());
        System.out.println("Imprimimos la cola: " + queue);
        System.out.println("Elimiinamos el elemento con mayor prioridad o el head de la lista");
        queue.remove();
        System.out.println("Volvemos a imprimir la lista: " + queue);
    }
}
