public interface Formula {

    default double getPerimeter() {
        return 0;
    }

    double getArea();
}