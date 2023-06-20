package app.task_3;


import java.util.List;




public class LoverCaseLength {

    public static void main(String[] args) {
        List<String> list =List.of("Back", "neck", "Hand", "hair", "abs");
        list.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .forEach(System.out::println);


    }
}
