package Collection2.studentEx;

import java.util.ArrayList;
import java.util.List;

public class UniversityTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Group A", 2, 4));
        students.add(new Student("Bob", "Group B", 3, 2));
        students.add(new Student("Charlie", "Group C", 1, 3));

        University university = new University(students);

        System.out.println("Студенты до исключения неуспевающих студентов:");
        university.getStudents().forEach(System.out::println);

        university.expulsionsofCstudents();

        System.out.println("\nСтуденты после исключения неуспевающих студентов:");
        university.getStudents().forEach(System.out::println);

        System.out.println("\nСтуденты первого курса:");
        university.printStudents(students, 1);
    }
}
