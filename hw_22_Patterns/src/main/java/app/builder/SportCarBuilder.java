package app.builder;

public class SportCarBuilder extends CarBuilder {
    @Override
    void buildHood() {
        car.setHood("Black");

    }

    @Override
    void buildDoor() {
        car.setDoor("Three doors");

    }

    @Override
    void buildTrunk() {
        car.setTrunk("Sport");

    }

    @Override
    void buildPrice() {
        car.setPrice(30000);

    }

    @Override
    void buildCms() {
        car.setCms(Cms.APPLECAR);

    }
}
