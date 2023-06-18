package app.task_3;

import static app.task_3.ArrayComposition.containsOnlyOnesAndFours;


public class RunArrayComposition {

    public static void main(String[] args) {

        int[] arr = {1, 4, 1};
        boolean result = containsOnlyOnesAndFours(arr);
        System.out.println(result);

    }
}
