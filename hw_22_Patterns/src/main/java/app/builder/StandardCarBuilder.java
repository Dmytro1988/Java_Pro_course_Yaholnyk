package app.builder;

public class StandardCarBuilder extends CarBuilder {
    @Override
    void buildHood() {
        car.setHood("White");

    }

    @Override
    void buildDoor() {
        car.setDoor("Four doors");

    }

    @Override
    void buildTrunk() {
        car.setTrunk("Standard");

    }

    @Override
    void buildPrice() {
        car.setPrice(20000);

    }

    @Override
    void buildCms() {
        car.setCms(Cms.ANDROIDAUTO);

    }
}
