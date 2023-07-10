package app.strategy;

public class AreaCalculator {
    private final Shape shape;

    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public double getArea() {
        if (shape == null){
            throw new IllegalStateException("Стратегія не встановлена");
        }
        return shape.getArea();
    }
}
