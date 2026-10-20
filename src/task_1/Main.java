package task_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product smartphone = new Product(
                "Samsung S25 Ultra",
                LocalDate.of(2025, 2, 1),
                "Samsung Corp.",
                "Korea",
                5599,
                true);

        smartphone.getInfo();

        Product[] productsArray = new Product[5];

        productsArray[0] = smartphone;
        productsArray[1] = new Product(
                "iPhone 16 Pro Max",
                LocalDate.of(2024, 9, 20),
                "Apple Inc.",
                "USA",
                6799,
                true);
        productsArray[2] = new Product(
                "Xiaomi 15 Ultra",
                LocalDate.of(2025, 3, 2),
                "Xiaomi Corp.",
                "China",
                4299,
                true);
        productsArray[3] = new Product(
                "Sony Xperia 1 VI",
                LocalDate.of(2024, 6, 14),
                "Sony Group Corp.",
                "Japan",
                5199,
                false);
        productsArray[4] = new Product(
                "Google Pixel 9 Pro",
                LocalDate.of(2024, 8, 22),
                "Google LLC",
                "USA",
                4999,
                true);
    }
}
