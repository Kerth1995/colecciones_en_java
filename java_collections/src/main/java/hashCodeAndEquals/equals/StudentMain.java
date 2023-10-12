package hashCodeAndEquals.equals;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Jordan", "1234");
        Student student2 = new Student(1, "Jordan", "1234");
        Student student3 = new Student(1, "Jordan", "1234");
        Student student4 = new Student(4, "Coronel", "1357");

        System.out.println(student1.equals(student1));
        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(student1));
        System.out.println(student2.equals(student3));
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student4));
    }
}
