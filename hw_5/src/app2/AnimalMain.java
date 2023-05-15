package app2;


    public class AnimalMain {
        public static void main(String[] args) {
            Cat cat1 = new Cat();
            Dog dog1 = new Dog();
            Dog dog2 = new Dog();

            cat1.run(100);
            cat1.swim(5);


            dog1.run(400);
            dog1.swim(10);

            dog2.run(600);
            dog2.swim(30);


            System.out.println("Кількість котів: " + Cat.getCount());
            System.out.println("Кількість собак: " + Dog.getCount());
            System.out.println("Загальна кількість тварин: " + (Cat.getCount() + Dog.getCount()));
        }
    }

