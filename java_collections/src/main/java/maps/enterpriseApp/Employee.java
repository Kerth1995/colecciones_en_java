package maps.enterpriseApp;

import java.util.Objects;

public class Employee {

    private Integer dni;
    private String name;
    private String nss;
    private String enterprise;

    public Employee() {
    }

    public Employee(int dni, String name, String nss, String enterprise) {
        this.dni = dni;
        this.name = name;
        this.nss = nss;
        this.enterprise = enterprise;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (dni != employee.dni) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(nss, employee.nss)) return false;
        return Objects.equals(enterprise, employee.enterprise);
    }

    @Override
    public int hashCode() {
        int result = dni;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nss != null ? nss.hashCode() : 0);
        result = 31 * result + (enterprise != null ? enterprise.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Integer=" + dni +
                ", name='" + name + '\'' +
                ", nss='" + nss + '\'' +
                ", enterprise='" + enterprise + '\'' +
                '}';
    }
}
