package gitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTestHW {

    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void simpleTest() {
        Assertions.assertTrue(true);
    }
}
