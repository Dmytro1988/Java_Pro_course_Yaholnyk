package app.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.buildCar();
        builder.buildHood();
        builder.buildDoor();
        builder.buildCms();
        builder.buildPrice();
        builder.buildTrunk();


        Car car = builder.getCar();

        return car;
    }
}
