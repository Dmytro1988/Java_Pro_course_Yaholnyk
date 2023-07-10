package app.factory;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = createFurnitureBySpeciality("sofa");
        Furniture furniture = furnitureFactory.createFactory();
        furniture.createFurniture();


    }

    static FurnitureFactory createFurnitureBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("Chair")) {
            return new ChairFactory();
        } else if (speciality.equalsIgnoreCase("Table")) {
            return new TableFactory();
        } else if (speciality.equalsIgnoreCase("sofa")) {
            return new SofaFactory();
        }else {
            throw new RuntimeException(speciality + " unknown speciality");
        }

    }
}
