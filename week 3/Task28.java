import java.util.ArrayList;
import java.util.Comparator;

public class Task28 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ravi", 78));
        students.add(new Student("Asha", 92));
        students.add(new Student("Meena", 85));

        students.sort(Comparator.comparingInt((Student student) -> student.marks).reversed());

        for (Student student : students) {
            System.out.println(student.name + " " + student.marks);
        }
    }

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }
}
