package app2;

    public class Cat extends Animal {
        private static int count = 0;

        public Cat() {
            count++;
        }
        public static int getCount() {
            return count;
        }
        @Override
        public void run(int distance) {
            if (distance <= Constants.CAT_MAX_RUN_DISTANCE) {
                System.out.println("Кіт Вася пробіг " + distance + " м.");
            } else {
                System.out.println("Кіт Вася не може пробігти більше " + Constants.CAT_MAX_RUN_DISTANCE + " м.");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println("Кіт Bacя не вміє плавати.");
        }
    }


