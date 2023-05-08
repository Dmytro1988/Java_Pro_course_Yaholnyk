package app;

import java.util.Arrays;
import java.util.Scanner;

public class Hw_3_tasks {
    public void ForPrintFrom1to99() {

        int i;
        for (i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    public void FactorialN() {

        int i;
        int n;
        int factorial;

        for (n = 1; n <= 5; n++) {
            factorial = 1;


            for (i = 1; i <= n; i++) {
                factorial *= i;

            }
            System.out.println("Factorial " + n + " = " + factorial);

        }
    }


    public void WhilePrintFrom1to99() {

        int a = 1;

        while (a <= 99) {
            System.out.println(a + " ");
            a += 2;
        }
    }


    public void WhilefactorialN() {


        int n = 5;
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
            System.out.println("Factorial " + n + " = " + factorial);


        }
    }

    public void DoWhilePrintFrom1to99() {

        int a = 1;
        do {
            a += 2;
            System.out.println(a);
        } while (a <= 99);
    }


    public void DoWhilefactorialN() {

        int n = 5;
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
            System.out.println("Factorial " + n + " = " + factorial);
        } while (i <= n);
    }


    public void PowerXN() {


        int x = 2;
        int n = 3;
        double res = 1;

        while (n > 0) {
            res *= x;
            n--;

        }
        System.out.println(res);

    }


    public void FirstTenNumbers() {

        int i;
        int num = 0;

        for (i = 1; i <= 10; i++) {

            System.out.println(i + ")" + num);
            num -= 5;
        }
    }


    public void MultipliOnXTable() {

        int x;
        int i = 5;
        int res;

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число:");
        x = input.nextInt();

        res = x * i;
        System.out.println(x + " * " + i + " = " + res);

    }


    public void FirstTenOddNumber() {

        int i;
        int n = 11;
        int j = 1;
        int[] arr = new int[n];

        for (i = 1; i < n; i++) {
            arr[i] = j;
            j += 2;

            System.out.println(i + ") " + arr[i] + " ");
        }

        for (i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }





    public void MinNumberOfArr() {

        int i;
        int[] mas = {5, 9, 2, -1, 6, 15, 10};
        int min = mas[0];

        for (i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.print(min);
        System.out.println();
    }


    public void MaxNumberOfArr() {

        int i;
        int[] mas = {5, 9, 2, -1, 6, 15, 10};
        int max = mas[0];

        for (i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.print(max);
        System.out.println();
    }


    public void ReplaceMaxAndMinNumArr() {

        int i;
        int rep;
        int[] mas = {5, 9, 2, -1, 6, 15, 10};
        int max = mas[0];
        int min = mas[0];
        int maxIndex = 0;
        int minIndex = 0;

        System.out.println(Arrays.toString(mas));

        for (i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }

            if (mas[i] < min) {
                min = mas[i];
                minIndex = i;
            }
        }


        rep = mas[maxIndex];
        mas[maxIndex] = mas[minIndex];
        mas[minIndex] = rep;
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }

    }
}



































