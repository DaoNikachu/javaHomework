package task_3;

public class Main {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 127;
        if (value <= 0) {
            System.out.println("Красный"); }
        else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");}
        else if (value > 100) {
            System.out.println("Зелёный");
        }
    }
}