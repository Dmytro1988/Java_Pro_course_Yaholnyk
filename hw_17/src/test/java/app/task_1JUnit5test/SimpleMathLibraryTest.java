package app.task_1JUnit5test;

import app.task_1.SimpleMathLibrary;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {

    @Test
    void add() {
        assertEquals(5.0, SimpleMathLibrary.add(2.0, 3.0), 0.0001);
    }

    @Test
    void minus() {
        assertEquals(-1, SimpleMathLibrary.minus(2.0, 3.0), 0.0001);
    }


}
