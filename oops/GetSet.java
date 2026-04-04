class Student {
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    int getMarks() {
        return marks;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(90);
        System.out.println(s.getMarks());
    }
}