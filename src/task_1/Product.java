package task_1;
import java.time.LocalDate;

public class Product {
    String name;
    LocalDate date;
    String manufacturer;
    String country;
    int price;
    boolean reserved;

    public Product (String name,
                    LocalDate date,
                    String manufacturer,
                    String country,
                    int price,
                    boolean reserved) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.reserved = reserved;
    }

    public void getInfo() {
        System.out.println("Name: " + name +
                           " Date: " + date +
                           " Manufacturer: " + manufacturer +
                           " Country: " + country +
                           " Price: " + price +
                           " Reserved: " + reserved);
    }
}
