package app.task_2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import java.util.List;



public class StringUpperCaseCollectionTest {


    @Test
    public void testCreateUpperCase() {
        Assertions.assertEquals(Arrays.asList(new Pair<>("one", "ONE"), new Pair<>("two", "TWO"), new Pair<>("three", "THREE")),
                StringUpperCaseCollection.createUpperCase(Arrays.asList("one", "two", "three")));
    }



    @Test
    public void testEmptyList() {
        Assertions.assertEquals(List.of(), StringUpperCaseCollection.createUpperCase(List.of()));
    }

}

