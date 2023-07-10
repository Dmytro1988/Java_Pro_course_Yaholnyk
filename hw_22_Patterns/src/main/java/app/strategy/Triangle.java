package app.strategy;

public class Triangle implements Shape {

    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }
}
