package task_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        isPositive(a);
    }

    public static void isPositive(int a) {
        System.out.println(a >= 0);
    }
}
