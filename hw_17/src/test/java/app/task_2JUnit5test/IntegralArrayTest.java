package app.task_2JUnit5test;

import app.task_2.IntegralArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegralArrayTest {

    @Test
    public void testExtractElementsNoFour() {
         assertThrows(RuntimeException.class,() -> IntegralArray.extractElements(new int[] {1, 2, 3}));


    }

    @Test
    public void testExtractElementsOneFour() {
        int[] expected = {};
        assertArrayEquals(expected, IntegralArray.extractElements(new int[]{1, 2, 4}));
    }

    @Test
    public void testExtractElementsMultipleFours() {
        int[] expected = {5};
        assertArrayEquals(expected, IntegralArray.extractElements(new int[]{1, 2, 4, 3, 4, 5}));
    }

}