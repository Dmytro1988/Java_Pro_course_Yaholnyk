package app.builder;

public abstract class  CarBuilder {

    Car car;
    void buildCar(){
        car = new Car();
    }
    abstract void buildHood();
    abstract void buildDoor();
    abstract void buildTrunk();
    abstract void buildPrice();
    abstract void buildCms();


    Car getCar(){
        return car;
    }
}
