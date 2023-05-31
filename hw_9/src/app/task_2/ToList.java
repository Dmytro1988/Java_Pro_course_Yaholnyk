package app.task_2;

import java.util.ArrayList;
import java.util.List;

public class ToList {

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
