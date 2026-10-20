package task_1;

public class Park {
    class Attraction {
        String name;      // название
        String workTime;  // время работы
        int price;        // стоимость

        Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        void show() {
            System.out.println(name + ", работает " + workTime + ", цена " + price + " руб.");
        }
    }
}