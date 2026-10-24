public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Vasya");
        cat.run(201);
        cat.swim(100);

        Cat cat1 = new Cat("Kappa");
        cat1.run(201);
        cat1.swim(100);

        Dog dog = new Dog("Misa");
        dog.run(501);
        dog.swim(9);

        Bowl bowl = new Bowl(10);
        Bowl newBowl = new Bowl(20);

        Cat[] cats = {new Cat("Chucho"), new Cat("Wookie"), new Cat("Panda")};

        cat.eat(bowl, 11);

        System.out.println("Animal count: " + Animal.getAnimalCount());
        System.out.println("Cat count: " + Cat.getCatCount());
        System.out.println("Dog count: " + Dog.getDogCount());

        System.out.println(cat.isFull());
        cat.eat(bowl, 5);
        System.out.println(cat.isFull());

        for (Cat catt : cats) {
            catt.eat(newBowl, 2);
        }

        for (Cat catt : cats) {
            System.out.println(catt.getName() + " is full: " + catt.isFull());
        }
    }
}
