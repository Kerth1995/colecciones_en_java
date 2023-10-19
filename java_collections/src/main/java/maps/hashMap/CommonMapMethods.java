package maps.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CommonMapMethods {
    public static void main(String[] args) {
        Map<String, String> players = new HashMap<>();
        players.put("Leo Messi", "Barcelona");
        players.put("Luis Suarez", "Barcelona");
        players.put("Arturo Vidal", "Barcelona");
        players.put("Rakitik", "Barcelona");
        players.put("Sergio Ramos", "Real Madrid");
        players.put("Toni Kross", "Real Madrid");
        players.put("Luka Modric", "Real Madrid");
        players.put("Ansu Fati", null);
        players.put("Paolo Guerrero", "Peru");
        players.put("Luis Advincula", "Peru");

        // se crea un mapa incializandole otro mapa
        Map<String, String> players2 = new HashMap<>(players);

        // se agrega un mapa a traves del metodo putAll
        Map<String, String> players3 = new HashMap<>();
        players3.putAll(players);

        // anadir un datos si un valor esta ausente
        players.putIfAbsent("Ansu Fati", "Barcelona");
        System.out.println("El equipo de Ansu Fati es: " + players.get("Ansu Fati"));

        // intentar cambio el valor de una key, ya no permite hacerlo con el metodo putIfAbsent
        players.putIfAbsent("Ansu Fati", "Peru");
        System.out.println("El equipo de Ansu Fati es: " + players.get("Ansu Fati"));

        // obtener los valores de un mapa
        String equipoLeo = players.get("Leo Messi");
        System.out.println("El equipo de Leo Messi es: " + equipoLeo);

        String equipoCristiano = players.getOrDefault("Cristiano Ronaldo"
                , "No existe en el diccionario de datos");
        System.out.println("El equipo de Cristiano Ronaldo es: " + equipoCristiano);

        // preguntar si nuestro map contiene una key en particular
        if (players.containsKey("Luka Modric"))
            System.out.println("El equipo de Luka Modric es: " + players.get("Luka Modric"));
        else
            System.out.println("No se encuentra Luka Modric");

        // preguntar si contiene un valor en especifico en el mapa de datos
        System.out.println("Se encuentra el equipo de Sevilla?? : " + players.containsValue("Sevilla"));

        // obtener todas las claves del mapa
        System.out.println("Las key del mapa son: " + players.keySet());

        // obtener todas los values del mapa
        System.out.println("Los value del mapa son: " + players.values());

        // reemplazar uno de los valores del mapa
        players.replace("Rakitik", "Sevilla");
        System.out.println("El nuevo equipo de Rakitik es: " + players.get("Rakitik"));

        // eliminar una entrada del diccionario de datos
        System.out.println("se encuentra Rakitik registrado??: " + players.containsKey("Rakitik"));
        players.remove("Rakitik");
        System.out.println("se encuentra Rakitik registrado??: " + players.containsKey("Rakitik"));

        // conocer el tamanio del mapa
        System.out.println("el tamanio del mapa es : " + players.size());

        // preguntar si el map esta vacion
        if (players.isEmpty())
            System.out.println("el mapa esta vacio");
        else
            System.out.println("el mapa no esta vacio");

        // limpiar un mapa
        players.clear();
        System.out.println("el mapa esta vacio?? : " + players.isEmpty());
    }
}
