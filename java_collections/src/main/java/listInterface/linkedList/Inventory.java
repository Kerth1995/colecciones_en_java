package listInterface.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private List<Product> products;

    public Inventory(){
        products = new LinkedList<>();
    }

    public void addProductAtInventory(Product product){
        if(products.add(product)){
            System.out.println("Producto agregado correctament");
        }else {
            System.out.println("Error al agregar el producto al inventario");
        }
    }

    public void addProductAtInventory(Integer id){
        System.out.println("Actualizando la existencia del producto");
        this.products
                .stream()
                .filter(product -> product.getId().equals(id))
                .map(product -> {
                    Integer quantity = product.getQuantity();
                    product.setQuantity(++quantity);
                    System.out.println(product);
                    return product;
                }).collect(Collectors.toList());

        System.out.println("Actualizacion realizada");
    }

    public void updateProductPriceInventory(Integer id, Double price){
        System.out.println("Actualizando el precio del producto");
        this.products
                .stream()
                .filter(product -> product.getId().equals(id))
                .map(product -> {
                    product.setPrice(price);
                    System.out.println(product);
                    return product;
                }).collect(Collectors.toList());
        System.out.println("Actualizacion realizada");
    }

    public void deleteProductInventory(Integer id) {
        this.products.removeIf(product -> product.getId().equals(id));
    }

    public void printProductsInventory(){
        System.out.println("Detalle del inventario de productos");
        System.out.println("===================================");
        products.forEach(System.out::println);
        System.out.println("===================================");
    }

}
