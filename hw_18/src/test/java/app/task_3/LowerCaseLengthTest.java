package app.task_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;



class LowerCaseLengthTest {

    @Test
    void lowCase() {
            List<String> list = Arrays.asList("Back", "neck", "Hand", "hair", "abs");
            Assertions.assertEquals(List.of("neck", "hair"), LowerCaseLength.lowCase(list));
        }


    @Test
    void testEmptyList() {
        List<String> list = List.of();
        Assertions.assertEquals(List.of(), LowerCaseLength.lowCase(list));
    }



}