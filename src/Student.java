import java.util.*;

class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades; // предмет -> оценка

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public Map<String, Integer> getGrades() { return grades; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group +
                "', course=" + course + ", grades=" + grades + "}";
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades.values()) {
            sum += g;
        }
        return (double) sum / grades.size();
    }

    public static void removeLowPerformers(List<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
        }

    public void promote() {
        if (getAverageGrade() >= 3) {
            course++;
            }
        }
    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}