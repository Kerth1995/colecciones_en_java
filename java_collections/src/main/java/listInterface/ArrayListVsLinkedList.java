package listInterface;

import entities.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Product> productArrayList = new ArrayList<>();
        List<Product> productLinkedList = new LinkedList<>();
        long time;
        System.out.println("VALIDAR TIEMPO AL INSERTAR 10000000 DE REGISTROS CON ARRAYLIST Y LINKEDLIST");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        for (int i = 0 ; i <10000000 ; i++){
            productArrayList.add(new Product("brand", "color", "model", "size"));
        }
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        for (int i = 0 ; i <10000000 ; i++){
            productLinkedList.add(new Product("brand", "color", "model", "size"));
        }
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("CONCLUSION: PARA AGREGAR ELEMENTOS EN UNA LISTA SE RECOMIENDA UTILIZAR LINKEDLIST EN " +
                "LUGAR DE EL ARRAYLIST");
        System.out.println("======================================================");
        System.out.println("SE REALIZAN PRUEBAS PARA VALIDAR EFICIENCIA DE REGISTROS NUEVOS EN DIFERENTES POSICIONES DE LAS LISTAS");

        System.out.println("ArrayList en la posicion 0");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(0, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 0");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(0, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 10");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(10, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 10");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(10, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 100");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(100, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 100");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(100, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 1000");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(1000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 1000");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(1000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 10000");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(10000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 10000");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(10000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 100000");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(100000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 100000");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(100000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 1000000");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(1000000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 1000000");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(1000000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
        System.out.println("ArrayList en la posicion 10000000");
        time =  System.nanoTime();
        System.out.println("Add data productArrayList - STARTED : " + time);
        productArrayList.add(10000000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productArrayList - FINISHED: " +  (System.nanoTime() - time));

        System.out.println("LinkedList en la posicion 10000000");
        time =  System.nanoTime();
        System.out.println("Add data productLinkedList - STARTED : " + time);
        productLinkedList.add(10000000, new Product("brand", "color", "model", "size"));
        System.out.println("Add data productLinkedList - FINISHED: " +  (System.nanoTime() - time));
        System.out.println("======================================================");
    }
}
