package app.task_3;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class LoverCaseLengthTest {


    @Test
    public void testFilter() {
        List<String> list = Arrays.asList("Back", "neck", "Hand", "hair", "abs");
        List<String> expected = List.of("neck", "hair");
        List<String> actual = list.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
        assertEquals(expected, actual);
    }

}