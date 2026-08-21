import java.util.ArrayList;
import java.util.Comparator;

public class Task28 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ravi", 85));
        students.add(new Student("Anu", 95));
        students.add(new Student("Kiran", 85));

        students.sort(Comparator.comparingInt((Student student) -> student.marks).reversed()
                .thenComparing(student -> student.name));

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
