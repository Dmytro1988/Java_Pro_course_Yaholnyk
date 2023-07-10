package app.builder;

public class BuildCarRun {
    public static void main(String[] args) {


        Director director = new Director();
        director.setBuilder(new SportCarBuilder());
        Car car = director.buildCar();

        System.out.println(car);


    }

}
