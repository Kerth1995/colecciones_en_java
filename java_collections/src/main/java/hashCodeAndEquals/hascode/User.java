package hashCodeAndEquals.hascode;

import java.util.Objects;

public class User {
    private Integer id;
    private String email;
    private String name;
    private String lastName;

    public User (Integer id, String email, String name, String lastName){
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(id, email, name, lastName);
        System.out.println("El objeto: " + this.getClass().getSimpleName()
                + " tiene el hascode: " + hashCode);
        return hashCode;
    }
}
