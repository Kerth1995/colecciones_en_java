package listInterface.node;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList =  new SimpleLinkedList();
        simpleLinkedList.push("Jordan");
        simpleLinkedList.push("Kerth");
        simpleLinkedList.push("Cotrina");
        simpleLinkedList.push("Coronel");
        simpleLinkedList.printContent();
        System.out.println("Agreamos un nuevo valor en una posicion exacta");
        simpleLinkedList.insert("Kerth", "Aurora");
        System.out.println("mostramos el nuevo arreglo");
        simpleLinkedList.printContent();
        System.out.println("¿La lista simple esta vacía? : " + simpleLinkedList.isEmpty());
        Node node = simpleLinkedList.contains("Jordan");
        if (node == null){
            System.out.println("No existe el dato en la lista");
        }else{
            System.out.println("Si existe el dato en la lista");
        }
        System.out.println("Eliminación de nodos");
        while (!simpleLinkedList.isEmpty()){
            node = simpleLinkedList.pop();
            System.out.println("Se ha eliminado el nodo: " + node.value());
            node.showContent();
        }
        System.out.println("mostramos la lista despues de haber eliminado todos los nodos");
        System.out.println("¿La lista simple esta vacía? : " + simpleLinkedList.isEmpty());
        simpleLinkedList.push("Emma");
        simpleLinkedList.push(43);
        simpleLinkedList.push("Jordan");
        simpleLinkedList.push(28);
        System.out.println("Mostramos lista con nuevos datos");
        simpleLinkedList.printContent();
        System.out.println("eliminaamos datos segun lo ingresado");
        simpleLinkedList.delete("Emma");
        simpleLinkedList.delete(43);
        System.out.println("Mostramos lista con nuevos datos");
        simpleLinkedList.printContent();
    }
}
