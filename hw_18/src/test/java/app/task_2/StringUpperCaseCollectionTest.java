package app.task_2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;



public class StringUpperCaseCollectionTest {


    @Test
    public void testCreateUpperCase() {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Pair<String,String>> expected = Arrays.asList(
                new Pair<>("one", "ONE"),
                new Pair<>("two", "TWO"),
                new Pair<>("three", "THREE")
        );
        List<Pair<String,String>> actual = StringUpperCaseCollection.createUpperCase(strings);
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testEmptyList() {
        List<String> strings = List.of();
        List<Pair<String,String>> expected = List.of();
        List<Pair<String,String>> actual = StringUpperCaseCollection.createUpperCase(strings);
        Assertions.assertEquals(expected, actual);
    }

}

