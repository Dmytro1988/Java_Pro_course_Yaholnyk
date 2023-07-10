package app.strategy;

public class Main {

    public static void main(String[] args) {

        Shape triangle = new Triangle(4,3);
        AreaCalculator triangleArea = new AreaCalculator(triangle);
        System.out.println(triangleArea.getArea());


        Shape rectangle = new Rectangle(2,4);
        AreaCalculator rectangleArea= new AreaCalculator(rectangle);
        System.out.println(rectangleArea.getArea());


    }
}
