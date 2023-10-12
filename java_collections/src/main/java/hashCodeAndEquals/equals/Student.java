package hashCodeAndEquals.equals;

import java.util.Objects;

public class Student {
    private Integer id;
    private String nname;
    private String phone;

    public Student(Integer id, String nname, String phone) {
        this.id = id;
        this.nname = nname;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(nname, student.nname) && Objects.equals(phone, student.phone);
    }
}
