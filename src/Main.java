import java.util.*;

public class Main {
    static class PhoneBook {
        private final Map<String, List<String>> book = new HashMap<>();

        public void add(String lastName, String phone) {
            book.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phone);
        }

        public List<String> get(String lastName) {
            return book.getOrDefault(lastName, new ArrayList<>());
        }
    }
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
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+7-900-111-11-11");

        System.out.println("Иванов: " + phoneBook.get("Иванов"));
    }
}
