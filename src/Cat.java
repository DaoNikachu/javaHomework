public class Cat extends Animal {
    boolean full = false;
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Cat " + name + " cannot run " + distance + " m");
        } else System.out.println("Cat " + name + " runs " + distance + " m");
    }

    public void swim(int distance) {
        System.out.println("Cat " + name + " cannot swim");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.takeFood(amount)) {
            System.out.println("Cat " + name + " has eaten " + amount + " food");
            full = true;
        } else {
            System.out.println("Cat " + name + " can't eat " + amount
                    + " food");
        }
    }
    public boolean isFull() {
        return full;
    }
    public String getName() {
        return name;
    }
}