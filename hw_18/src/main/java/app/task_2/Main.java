package app.task_2;

import java.util.List;
import static app.task_2.StringUpperCaseCollection.createUpperCase;



public class Main {

    public static void main(String[] args) {


        List<String> strings = List.of("one", "two", "three");
        List<Pair<String, String>> upperCasePairs = createUpperCase(strings);
        for (Pair<String, String> pair : upperCasePairs) {
            System.out.println(pair.first() + ":" + pair.second());
        }
    }



}
