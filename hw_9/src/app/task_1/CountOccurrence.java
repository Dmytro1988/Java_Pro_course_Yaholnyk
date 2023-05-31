package app.task_1;

import java.util.ArrayList;
import java.util.List;

public class CountOccurrence {
    public  int countOccurrence(List<String> list, String pattern) {
        int count = 0;
        for (String mas : list) {
            if (mas.equals(pattern)) {
                count++;
            }
        }
            return count;
        }

        public  List<String>getList(List<String> mas, int count){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String word = getRandomWord(mas);
            result.add(word);
        }
        return result;

        }

        private static String getRandomWord(List<String> mas){
        return mas.get((int) (Math.random() * mas.size()));
        }


    }




