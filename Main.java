import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ravi", 85));
        students.add(new Student("Anita", 92));
        students.add(new Student("Kiran", 70));
        students.add(new Student("Meena", 60));

        // 1️⃣ Filter students with marks > 75
        List<Student> topStudents = students.stream()
                .filter(s -> s.getMarks() > 75)
                .collect(Collectors.toList());

        System.out.println("Top Students:");
        topStudents.forEach(System.out::println);

        // 2️⃣ Get only student names
        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("\nStudent Names:");
        names.forEach(System.out::println);

        // 3️⃣ Calculate average marks
        double avg = students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0);

        System.out.println("\nAverage Marks: " + avg);
    }
}