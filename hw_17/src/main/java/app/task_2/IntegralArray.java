package app.task_2;

public class IntegralArray {
    public static int[] extractElements(int[] arr) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }

        if (index == -1) {
            throw new RuntimeException("Array does not contain 4");
        }

        int[] result = new int[arr.length - index - 1];

        for (int i = index + 1; i < arr.length; i++) {
            result[i - index - 1] = arr[i];
        }

        return result;
    }
}
