class Student {
    String name;

    Student(String n) {
        name = n;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student("Kaustubh");
        System.out.println(s.name);
    }
}