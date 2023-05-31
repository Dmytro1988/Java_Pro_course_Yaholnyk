package app.task_3;

import java.util.Arrays;
import java.util.List;

import static app.task_3.FindUnique.findUnique;

public class RunFindUnique {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 5, 3, 6, 3, 7, 8);
        List<Integer> uniqueList = findUnique(list);
        System.out.println("Original list: " + list);
        System.out.println("Unique list: " + uniqueList);
    }




}
