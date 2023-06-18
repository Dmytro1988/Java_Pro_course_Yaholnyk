package app.task_2JUnit4test;

import static app.task_2.IntegralArray.extractElements;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntegralArrayTest {

    @org.junit.Test(expected = RuntimeException.class)
    public void
    testExtractElementsNoFour() {
        int[] arr = {1, 2, 3};
        extractElements(arr);
    }
    @org.junit.Test
    public void
    testExtractElementsOneFour() {
        int[] arr = {1, 2, 4};
        int[] expected = {};
        assertArrayEquals(expected, extractElements(arr));
    }

    @org.junit.Test
        public void
    testExtractElementsMultipleFours() {
        int[] arr = {1, 2, 4, 3, 4, 5};
        int[] expected = {5};
        assertArrayEquals(expected, extractElements(arr));
    }


}