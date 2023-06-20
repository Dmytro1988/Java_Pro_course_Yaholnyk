package app.task_1;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CollectionAverageIntegerTest {


    @Test
    public void
    testAverage() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average().
                orElse(Double.NaN);
        assertEquals(3.0, average, 0.00001);
    }


}