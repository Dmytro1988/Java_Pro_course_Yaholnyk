package app;

public class RunCustomCollection {

    public static void main(String[] args) {
        //int value = 100;
        CustomCollection collection = new CustomCollection(100);


        collection.add("Hello");
        collection.add("java");
        collection.add(0, "Pro");
        collection.printCollection();
        System.out.println("----------------------------------");

        collection.delete("Pro");
        collection.printCollection();
        System.out.println("----------------");

        collection.delete(0);
        collection.printCollection();
        System.out.println("-----------------");
        collection.add("Hillel");
        collection.add("school");
        collection.add("!");
        collection.printCollection();
        System.out.println("---------------------");

        collection.printCollection();
        System.out.println("Елемент за індексом 3:");
        System.out.println(collection.get(3));

    }

}
