package app.task_2;

import java.util.Arrays;

import static app.task_2.IntegralArray.extractElements;


public class RunIntegralArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] result = extractElements(arr);
        System.out.println(Arrays.toString(result));

    }
}
