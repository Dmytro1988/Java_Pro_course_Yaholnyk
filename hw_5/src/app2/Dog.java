package app2;

    public class Dog extends Animal {

        private static int count = 0;

        public Dog() {
            count++;
        }
        public static int getCount() {
            return count;
        }

        @Override
        public void run(int distance) {
            if (distance <= Constants.DOG_MAX_RUN_DISTANCE) {
                System.out.println("Собака Бобік пробігла " + distance + " м.");
            } else {
                System.out.println("Собака Бобік не може пробігти більше " + Constants.DOG_MAX_RUN_DISTANCE + " м.");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance <= Constants.DOG_MAX_SWIM_DISTANCE) {
                System.out.println("Собака Бобік пропливла " + distance + " м.");
            } else {
                System.out.println("Собака Бобік не може проплисти більше " + Constants.DOG_MAX_SWIM_DISTANCE + " м.");
            }
        }
    }

