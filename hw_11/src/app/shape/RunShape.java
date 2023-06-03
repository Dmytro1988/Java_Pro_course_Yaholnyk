package app.shape;


public class RunShape {

    public static void main(String[] args) {

        double totalArea;

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Triangle(2, 2);
        shapes[2] = new Square(5);

        totalArea = CalculateTotalArea(shapes);
        System.out.println(" The total area of the figures: " + totalArea + " m2.");
    }


        public static double CalculateTotalArea(Shape[] shapes ){
            double totalArea = 0;
            for (Shape shape : shapes) {
                totalArea += shape.getArea();

            }
            return totalArea;

        }
    }



