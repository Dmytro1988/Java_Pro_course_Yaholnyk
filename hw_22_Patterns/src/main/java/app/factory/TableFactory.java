package app.factory;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFactory() {
        return new Table();
    }
}
