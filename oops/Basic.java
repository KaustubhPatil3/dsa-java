class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Basic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kaustubh";
        s1.age = 21;
        s1.display();
    }
}