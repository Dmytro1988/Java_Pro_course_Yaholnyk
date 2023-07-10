package app.factory;

public class Chair implements Furniture {
    @Override
    public void createFurniture(){
        System.out.println("chair ready");
    }


}
