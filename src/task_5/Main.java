package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        boolean result = isIntInRange (a, b);
        System.out.println(result);
    }
    public static boolean isIntInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
