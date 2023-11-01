package maps.hashMap;

import java.util.*;

public class ConteoTipoPalabras {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        crearMap(myMap);
        mostrarMapa(myMap);
    }

    public static void crearMap(Map<String, Integer> myMap){
        Scanner scanner = new Scanner(System.in);
        // HOLA QUE TAL, COMO ESTAS QUE TE TRAE POR AQUI. TANTO QUE EL ME HABLO DE TI..... ES VERDAD, TODO LO QUE ME DIJO ES ASI
        System.out.println("==== Escribir una cadena ====");
        String entrada = scanner.nextLine();
        String[] phrase = entrada.split(" ");
        String eachLetter = "";
        for (String letter:phrase) {
            eachLetter = letter.toLowerCase();

            if (myMap.containsKey(eachLetter)){
                int cuenta = myMap.get(eachLetter);
                myMap.put(eachLetter, cuenta+1);
            }else{
                myMap.put(eachLetter, 1);
            }
            eachLetter = "";
        }
    }

    public static void mostrarMapa(Map<String, Integer> myMap){
        System.out.println("Unsorted Map");
        myMap.forEach((s, integer) -> {
            System.out.println("La palabra:: '" + s + "' se repite:: " + integer + " veces");
        });
    }
}
