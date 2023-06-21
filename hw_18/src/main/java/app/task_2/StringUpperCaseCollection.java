package app.task_2;

import java.util.ArrayList;
import java.util.List;


public class StringUpperCaseCollection {

        public static List<Pair<String, String>> createUpperCase(List<String> strings) {
            List<Pair<String, String>> upperCasePairs = new ArrayList<>();
            for (String list : strings) {
                String upperCaseString = list.toUpperCase();
                Pair<String, String> pair = new Pair<>(list, upperCaseString);
                upperCasePairs.add(pair);
            }
            return upperCasePairs;
        }

}






