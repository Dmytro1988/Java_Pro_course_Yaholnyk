package app.task_1;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CollectionAverageIntegerTest {

    @Test
    void calAverage() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, new CollectionAverageInteger().calAverages(list));

    }



}




