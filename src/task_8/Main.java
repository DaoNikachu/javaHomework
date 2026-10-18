package task_8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int num = new Scanner(System.in).nextInt();
        strNum(str, num);
    }

    public static void strNum(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}

