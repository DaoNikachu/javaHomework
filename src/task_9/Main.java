package task_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
