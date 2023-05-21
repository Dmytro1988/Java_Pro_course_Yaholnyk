package app;


public class RunDynamicStringCollection{

    public static void main(String[] args) {

        DynamicStringCollection collection = new DynamicStringCollection();

        collection.add("Hello");
        collection.add("Java");
        collection.add("Pro");
        collection.add("Hillel");
        collection.printCollection();
        System.out.println("-----------------------------");

        collection.add(4, "School");
        collection.printCollection();
        System.out.println("-----------------------------");

        collection.delete("Java");
        collection.printCollection();
        System.out.println("-----------------------------");

        collection.delete(3);
        collection.printCollection();
        System.out.println("-----------------------------");

        System.out.println(collection.get(2));

        }
    }















