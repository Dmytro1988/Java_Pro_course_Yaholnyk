package app.task_3JUnit5test;

import org.junit.jupiter.api.Test;

import static app.task_3.ArrayComposition.containsOnlyOnesAndFours;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCompositionTest {

    @Test
    public void testContainsOnlyOnesAndFoursTrue() {
        int[] arr = {1, 4, 1};
        assertTrue(containsOnlyOnesAndFours(arr));
    }

    @Test
    public void testContainsOnlyOnesAndFoursFalse() {
        int[] arr = {1, 2, 3};
        assertFalse(containsOnlyOnesAndFours(arr));
    }

    @Test
    public void testContainsOnlyOnesAndFoursEmpty() {
        int[] arr = {};
        assertTrue(containsOnlyOnesAndFours(arr));
    }

}