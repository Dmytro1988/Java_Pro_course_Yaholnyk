package app;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSum10To20(15, 10));
        wholeNum(0);
        System.out.println(isNumPositive(-2));
        printString("Hello world", 3);
        System.out.println(isLeapYear(2023));


    }

    public static void printThreeWords() {
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("--------------------");
    }

    public static void checkSumSign() {

        int a = 5;
        int b = -10;

        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
        System.out.println("----------------");

    }

    public static void printColor() {

        int value = 80;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value < 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
        System.out.println("--------------");

    }

    public static void compareNumbers() {

        int a = 25;
        int b = 30;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("---------------------");
    }

    public static boolean isSum10To20(int a, int b) {

        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void wholeNum(int a) {
        System.out.println("-------------------");

        if (a >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Від’ємне число");
        }
        System.out.println("-------------------------");
    }

    public static boolean isNumPositive(int a) {

        return a > 0;
    }

    public static void printString(String str, int n) {
        System.out.println("-----------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
        System.out.println("--------------------------");

    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;

    }
}



