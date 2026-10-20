package task_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product smartphone = new Product("Samsung S25 Ultra", LocalDate.of(2025, 2, 1), "Samsung Corp.", "Korea", 5599, true);

        smartphone.getInfo();
    }
}
