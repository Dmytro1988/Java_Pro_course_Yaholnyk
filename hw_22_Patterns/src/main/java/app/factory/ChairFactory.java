package app.factory;

public class ChairFactory implements FurnitureFactory {


    @Override
    public Furniture createFactory() {
        return new Chair();
    }
}
