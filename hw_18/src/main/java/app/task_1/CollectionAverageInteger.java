package app.task_1;

import java.util.Arrays;
import java.util.List;

public class CollectionAverageInteger {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
        System.out.println("Середнє значення: " + average);

    }
}
