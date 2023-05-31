package app.task_4;

import java.util.Arrays;
import java.util.List;


import static app.task_4.CalcOccurance.calcOccurance;


public class RunCalcOccurance {
    public static void main(String[] args) {

            List<String> words = Arrays.asList("dog", "bird", "fox", "cat", "bird", "dog", "cow", "bull");
            calcOccurance(words);


    }



}
