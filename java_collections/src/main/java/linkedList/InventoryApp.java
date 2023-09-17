package linkedList;

import java.util.Scanner;

public class InventoryApp {
    private Scanner scanner;
    private Inventory inventory;

    public static void main(String[] args) {
        InventoryApp inventoryApp = new InventoryApp();
        inventoryApp.init();
    }

    public void init(){
        scanner = new Scanner(System.in);
        inventory = new Inventory();

        int op;
        do {
            System.out.println("\n\n\t Menu \t");
            System.out.println("---- Controlar Inventarios ----");
            System.out.println("1. Crear nuevo producto");
            System.out.println("2. Agregar producto al inventario");
            System.out.println("3. Eliminar producto del inventario");
            System.out.println("4. Actualizar precio del producto");
            System.out.println("5. Mostrar productos del inventario");
            System.out.println("6. Salir");
            System.out.println("\n Seleccionar la opcion requerida");
            op = scanner.nextInt();

            switch (op){
                case 1 :
                    createNewProduct();
                    break;
                case 2 :
                    addProductAtInventory();
                    break;
                case 3 :
                    deleteProductInventory();
                    break;
                case 4 :
                    updateProductPriceInventory();
                    break;
                case 5 :
                    printProductsInventory();
                    break;
            }
        }while (op != 6);
    }

    private void createNewProduct() {
        Product product = new Product();
        System.out.println("Id del producto");
        product.setId(scanner.nextInt());

        System.out.println("Nombre del producto");
        product.setName(scanner.next());

        System.out.println("Existencia inicial del producto");
        product.setQuantity(scanner.nextInt());

        System.out.println("Precio del producto");
        product.setPrice(scanner.nextDouble());
        inventory.addProductAtInventory(product);
    }

    private void addProductAtInventory() {
        System.out.println("Ingrese el ID del producto a actualizar ");
        Integer id = scanner.nextInt();
        this.inventory.addProductAtInventory(id);
    }

    private void deleteProductInventory() {
        System.out.println("Ingrese el ID del producto a eliminar ");
        Integer id = scanner.nextInt();
        this.inventory.deleteProductInventory(id);
    }

    private void updateProductPriceInventory() {
        System.out.println("Ingrese el ID del producto a actualizar ");
        Integer id = scanner.nextInt();
        System.out.println("Ingrese el nuevo precio del producto a actualizar ");
        Double price = scanner.nextDouble();
        this.inventory.updateProductPriceInventory(id, price);
    }

    private void printProductsInventory() {
        this.inventory.printProductsInventory();
    }
}
