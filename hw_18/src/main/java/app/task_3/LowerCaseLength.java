package app.task_3;


import java.util.List;
import java.util.stream.Collectors;




public class LowerCaseLength {

    public static List<String> lowCase(List<String> list){
        List<String> filter = list.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
    return filter;

    }
}
