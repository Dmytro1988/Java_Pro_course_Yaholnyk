package app;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculate {
    public class averageCalculate {

        static int count;
        static double sum;
        static double[] array;
        static double average;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть кількість чисел:");
            count = scanner.nextInt();
            array = new double[count];
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введіть число " + (i + 1) + " : ");
                array[i] = scanner.nextDouble();
            }
            scanner.close();
            for (double num : array) {
                sum = sum + num;
            }
            average = sum / count;
            System.out.format("Середнє значення: %.2f", average);
        }
    }


    class arrayAverValue {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<Double> numbers = new ArrayList<>();

            System.out.println("Введіть масив чисел(для закінчення введіть щось крім цифр):");
            while (input.hasNextDouble()) {
                double num = input.nextDouble();
                numbers.add(num);
            }
            if (numbers.isEmpty()) {
                System.out.println("Не має введених чисел");
            } else {
                double sum = 0;
                for (double num : numbers) {
                    sum += num;
                }
                double averValue = sum / numbers.size();
                System.out.println("Середнє арифметичне масива:" + averValue);
            }
        }
    }


}
