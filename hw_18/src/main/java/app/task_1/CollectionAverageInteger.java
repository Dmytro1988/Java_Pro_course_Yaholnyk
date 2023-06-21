package app.task_1;


import java.util.List;

public class CollectionAverageInteger {

    public double calAverages(List<Integer> list) {

       double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
        return average;
    }
}
