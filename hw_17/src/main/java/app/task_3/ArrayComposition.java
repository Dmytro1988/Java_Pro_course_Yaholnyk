package app.task_3;

public class ArrayComposition {


    public static boolean containsOnlyOnesAndFours(int[] arr) {
        for (int j : arr) {
            if (j != 1 && j != 4) {
                return false;
            }
        }

        return true;
    }
}
