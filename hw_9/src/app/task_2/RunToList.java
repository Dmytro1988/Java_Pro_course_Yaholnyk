package app.task_2;

import java.util.Arrays;
import java.util.List;

import static app.task_2.ToList.toList;

public class RunToList {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> list = toList(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);
    }

}
