package app;

public class RunCustomCollection {

    public static void main(String[] args) {
        //int value = 100;
        CustomCollectionService collection = new CustomCollectionServiceImpl(100);

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
        System.out.println("----------------------");
        System.out.println("Розмір колекці: " + collection.size());
        System.out.println("-----------------------");
        System.out.println(collection.contain("school"));
        System.out.println("---------------------------------");
        collection.clear();
        System.out.println("Розмір після видалення: " + collection.size());
        System.out.println("-----------------------------");

        CustomCollectionService collection1 = new CustomCollectionServiceImpl(100);

        System.out.println("колекція 1: ");
        collection1.add("Python");
        collection1.add("Java");
        collection1.add(1, "JavaScript");
        collection1.printCollection();
        System.out.println("Колекція рівна колекції 1: " + collection.equals(collection1));
        System.out.println("-----------------------------");

        CustomCollectionService collection2 = new CustomCollectionServiceImpl(100);
        System.out.println("колекція 2: ");
        collection2.add("Python");
        collection2.add("Java");
        collection2.add(1, "JavaScript");
        collection2.printCollection();
        System.out.println("Колекція 2 рівна колекції 1: " + collection2.equals(collection1));


    }

}

