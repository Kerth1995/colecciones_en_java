package maps.enterpriseApp;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class EnterpriseApp {

    private Map<Enterprise, List<Employee>> enterprise;
    private Scanner scanner;

    public EnterpriseApp(){
        enterprise = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void init() throws InterruptedException {
        int operacion = 0;

        do {
            System.out.println("\n\n\t Menu \t");
            System.out.println("---- Empleados ----");
            System.out.println("1.- Dar de alta a la empresa: ");
            System.out.println("2.- Dar de alta empleado: ");
            System.out.println("3.- Imprimir relacion");
            System.out.println("4.- Salir");

            System.out.println("\nSeleccione la operacion a realizar");
            operacion = scanner.nextInt();

            switch (operacion){
                case 1:
                    crateEnterprise();
                    break;
                case 2:
                    createEmployee();
                    break;
                case 3:
                    print();
                    break;                    
            }
        }while (operacion!=4);
    }

    private void crateEnterprise() {
        System.out.println("Ingresar el nombre de la nueva empresa");
        String newEnterpriseName = scanner.next();
        System.out.println("Ingresar el sector de la nueva empresa");
        String newEnterpriseSector = scanner.next();
        AtomicReference<Boolean> isAlreadyExistEnterprise = new AtomicReference<>(false);
        enterprise.forEach((enterprise1, employees) -> {
            if(enterprise1.getName().toLowerCase().equals(newEnterpriseName.toLowerCase().trim()))
                isAlreadyExistEnterprise.set(true);
            else
                isAlreadyExistEnterprise.set(false);
        });

        if (isAlreadyExistEnterprise.get().booleanValue())
            System.out.println("La empresa ya existe");
        else{
            Enterprise enterprise1 = new Enterprise(enterprise.size()+1, newEnterpriseName, newEnterpriseSector);
            enterprise.put(enterprise1, new ArrayList<>());
        }
    }

    private void createEmployee() {
        System.out.println("Ingresar el DNI del empleado");
        Integer newEmployeeDni = scanner.nextInt();
        System.out.println("Ingresar el nombre del empleado");
        String newEmployeeNombre = scanner.next();
        System.out.println("Ingresar el NSS del empleado");
        String newEmployeeNss = scanner.next();
        System.out.println("Ingresar la emprese del empleado");
        String newEnterpriseName = scanner.next();

        AtomicReference<Boolean> isAlreadyExistEnterprise = new AtomicReference<>(false);
        AtomicReference<Boolean> isAlreadyExistEmployee = new AtomicReference<>(false);
        enterprise.forEach((enterprise1, employees) -> {
            if(!isAlreadyExistEnterprise.get()){
                if(enterprise1.getName().equalsIgnoreCase(newEnterpriseName.toLowerCase()))
                    isAlreadyExistEnterprise.set(true);
                else{
                    isAlreadyExistEnterprise.set(false);
                    employees.forEach(employee -> {
                        if(employee.getDni().equals(newEmployeeDni))
                            isAlreadyExistEmployee.set(true);
                        else
                            isAlreadyExistEmployee.set(false);
                    });
                }
            }else {
                employees.forEach(employee -> {
                    if(employee.getDni().equals(newEmployeeDni))
                        isAlreadyExistEmployee.set(true);
                    else
                        isAlreadyExistEmployee.set(false);
                });
            }

        });

        if (!isAlreadyExistEnterprise.get())
            System.out.println("La empresa no existe. Por favor registrar la empresa antes de registrar al empleado");
        else{
            if(isAlreadyExistEmployee.get())
                System.out.println("El empleado ya esta registrado para esta empresa");
            else{
                enterprise.forEach((enterprise1, employees) -> {
                    Employee employee = new Employee(newEmployeeDni, newEmployeeNombre, newEmployeeNss, newEnterpriseName);
                    if (enterprise1.getName().equalsIgnoreCase(newEnterpriseName))
                        employees.add(employee);
                });
            }
        }
    }

    private void print() throws InterruptedException {

        if (enterprise.isEmpty()) {
            System.out.println("Haciendo la consulta en la base de datos");
            Thread.sleep(200);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(600);
            System.out.println("");
            System.out.println(" No hay datos a mostrar");
            Thread.sleep(800);

        }else{
            System.out.println("Haciendo la consulta en la base de datos");
            Thread.sleep(200);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(600);
            System.out.println("");
            enterprise.forEach((enterprise1, employees) -> {
                System.out.println("=====================================================================");
                if(employees.isEmpty()){
                    System.out.println("La empresa " +
                            enterprise1.getName().toUpperCase() +
                            " no tiene empleados registrados");
                    System.out.println("=====================================================================");
                }else {
                    System.out.println("La empresa " +
                            enterprise1.getName().toUpperCase() +
                            " tiene " + employees.size() + " empleados");

                    employees.forEach(employee -> System.out.println(employee.toString()));
                    System.out.println("=====================================================================");
                }
            });
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EnterpriseApp enterpriseApp = new EnterpriseApp();
        enterpriseApp.init();
    }
}
