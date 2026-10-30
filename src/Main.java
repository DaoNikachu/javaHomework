import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vlad", "ИБТ-1", 2, Map.of("Физика", 5, "Математика", 5, "Биология", 5)));
        students.add(new Student("Misha", "ИБТ-1", 2, Map.of("Физика", 4, "Математика", 5, "Биология", 3)));
        students.add(new Student("Anna", "ИБТ-1", 2, Map.of("Физика", 3, "Математика", 3, "Биология", 2)));

        for (Student s : students) {
            System.out.println(s);
        }

        Set<Student> set = new HashSet<>(students);
        Student.printStudents(set, 2);

        Student.removeLowPerformers(students);

        for (Student s : students) {
            s.promote();
        }
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
