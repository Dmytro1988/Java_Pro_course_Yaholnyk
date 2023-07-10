package app.factory;

public class SofaFactory implements FurnitureFactory{
    @Override
    public Furniture createFactory() {
        return new Sofa();
    }
}
