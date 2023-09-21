package stacksAndQueues.stacks.classStack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();

        pila.push(12L);
        System.out.println("Se inserto 12L");
        imprimir(pila);
        pila.push(14L);
        System.out.println("Se inserto 14L");
        imprimir(pila);
        pila.push(16L);
        System.out.println("Se inserto 16L");
        imprimir(pila);
        pila.push(10L);
        System.out.println("Se inserto 10L");
        imprimir(pila);
        pila.push(8L);
        System.out.println("Se inserto 8L");
        imprimir(pila);
        pila.push(18L);
        System.out.println("Se inserto 18L");
        imprimir(pila);

        System.out.println("==============================================");
        System.out.println("---- ELIMINAR ELEMENTOS DE LA PILA STACK -----");
        try {
            Number objtDeleted = null;
            while (!pila.isEmpty()){
                objtDeleted = pila.pop();
                System.out.println("se obtiene : " + objtDeleted);
                imprimir(pila);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("==============================================");
    }

    public static void imprimir(Stack<Number> pila){

        if(pila.isEmpty()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("La cabecera de la pila es: " + pila.peek());
            System.out.println("Total de elementos de la pila: " + pila);
        }
    }
}
