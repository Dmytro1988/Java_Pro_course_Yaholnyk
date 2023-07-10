package app.factory;

public class Table implements Furniture {

    @Override
    public void createFurniture(){
        System.out.println("table ready");
    }

}
