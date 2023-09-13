package listInterface.ArrayListImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creacion de ArrayList
        List<String> listaColores = new ArrayList<>();

        // Agregamos elementos
        listaColores.add("Morado");
        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Azul");

        // Creacion de un ArrayList mediante un arreglo
        String nombres[] = {"Jordan", "Kerth", "Cotrina", "Coronel"};
        List<String> listaNombres = Arrays.asList(nombres);

        // Contruir una lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);

        //Agregamos una lista dentro de otra lista
        elementos.addAll(listaNombres);

        // imprimimos valores
        System.out.println("listaColores = " + listaColores);
        listaColores.forEach(System.out::println);
        System.out.println("listaNombres = " + listaNombres);
        listaNombres.forEach(System.out::println);
        System.out.println("elementos = " + elementos);
        elementos.forEach(System.out::println);
    }
}
