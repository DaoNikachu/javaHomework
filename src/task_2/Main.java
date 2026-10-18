package task_2;

public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    private static void checkSumSign() {
        int a = -100;
        int b = 99;
        long sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
}
