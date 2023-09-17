package listInterface.arrayListImpl;

import entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 EL OBJETIVO ES VALIDAR SI LOS PRODUCTOS EXISTEN BASADO EN EL FILTRO
 QUE SE REALIZARA POR MARCA, DE EXISTIR, SE TIENEN QUE ELIMINAR ESAS MARCAS
 * */

public class ArratListProductExample {

    private List<Product> productFiltered;

    public static Product[] getProducts(){
        Product[] products = {
                new Product("H&M", "Grey", "Pay", "32L"),
                new Product("Zara", "Red", "Sexy", "34L"),
                new Product("H&M", "Green", "Light", "30L"),
                new Product("TopiTop", "Blue", "Fashion", "28L"),
                new Product("Zara", "Blue", "Fashion", "28L"),
                new Product("H&M", "Green", "Light", "30L"),
                new Product("TopiTop", "Red", "Sexy", "32L"),
                new Product("H&M", "Grey", "Pay", "34L"),
                new Product("Lacoste", "Purple", "Sexy", "32L"),
                new Product("H&M", "Grey", "Fashion", "30L"),
                new Product("Lacoste", "Purple", "Light", "28L")
        };
        return products;
    }

    public static void main(String[] args) {
        List<String> filterByBrand = new ArrayList<>(Arrays.asList("H&M", "Lacoste"));
        List<Product> products = new ArrayList<>(Arrays.asList(getProducts()));
        products.forEach(System.out::println);
        //deleteBrandWithIterator(products, filterByBrand);
        deleteBrandWithStreams(products, filterByBrand);
        System.out.println("---------- New result ----------");
        products.forEach(System.out::println);
    }

    private static void deleteBrandWithIterator(List<Product> products, List<String> filters){
        System.out.println("Filter by Brand ---- STARTED");
        for (ListIterator<Product> iteratorProducts = products.listIterator(); iteratorProducts.hasNext();){
            if(filters.contains(iteratorProducts.next().getBrand())){
                iteratorProducts.remove();
            }
        }
        System.out.println("Filter by Brand ---- ENDED");
    }

    private static void deleteBrandWithStreams(List<Product> products, List<String> filters){
        System.out.println("Filter by Brand ---- STARTED");
        /*
        products
                .stream()
                .filter(product -> !filters.contains(product.getBrand()))
                .collect(Collectors.toList());
        */
        products.removeIf(product -> filters.contains(product.getBrand()));
        System.out.println("Filter by Brand ---- ENDED");
    }
}
