public class Dog extends Animal {
    private static int dogCount= 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Dog " + name + " runs " + distance + " m");
        }
        else System.out.println("Dog " + name + " cannot run " + distance + " m");
    }
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Dog " + name + " swims " + distance + " m");
        }
        else System.out.println("Dog " + name + " cannot swim " + distance + " m");
    }
}
