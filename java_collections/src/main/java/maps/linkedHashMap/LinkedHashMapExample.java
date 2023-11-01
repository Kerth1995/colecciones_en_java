package maps.linkedHashMap;

import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap = new java.util.LinkedHashMap<>();
        hashMap.put("uno", "Jordan");
        hashMap.put("dos", "Kerth");
        hashMap.put("tres", "Cotrina");
        hashMap.put("cuatro", "Coronel");
        hashMap.put("cinco", "Aurora");
        hashMap.put("seis", "Coronel");
        hashMap.put("siete", "Rafael");
        hashMap.put("ocho", "Karla");
        hashMap.put("nueve", "Yulisa");
        hashMap.put("diez", "Becerra");
        hashMap.put("once", "Coronel");
        hashMap.put("doce", "Jose");
        hashMap.put("trece", "Kerth");
        hashMap.put("catorce", "Gomez");
        hashMap.put("quince", "Becerra");
        hashMap.put("dieciseis", "Emma");

        System.out.println("ejemplo con key como string");
        hashMap.forEach((s, s2) -> {
            System.out.println("Key: " + s + " - Value: " + s2);
        });

        Map<Integer, String> hashMap2 = new java.util.LinkedHashMap<>();
        hashMap2.put(1, "Jordan");
        hashMap2.put(2, "Kerth");
        hashMap2.put(3, "Cotrina");
        hashMap2.put(4, "Coronel");
        hashMap2.put(5, "Aurora");
        hashMap2.put(6, "Coronel");
        hashMap2.put(7, "Rafael");
        hashMap2.put(8, "Karla");
        hashMap2.put(16, "Yulisa");
        hashMap2.put(15, "Becerra");
        hashMap2.put(14, "Coronel");
        hashMap2.put(13, "Jose");
        hashMap2.put(12, "Kerth");
        hashMap2.put(11, "Gomez");
        hashMap2.put(10, "Becerra");
        hashMap2.put(9, "Emma");

        System.out.println("ejemplo con key como integer");
        hashMap2.forEach((s, s2) -> {
            System.out.println("Key: " + s + " - Value: " + s2);
        });

        /*
        podemos evidenciar que HashMap si ordena al diccionario de datos basado en la insercion de
        los valores. Y en el segundo caso
        si hay un orden debido a que el codigo hash que genera el diccionario incrementa siempre en uno
         */
    }
}
