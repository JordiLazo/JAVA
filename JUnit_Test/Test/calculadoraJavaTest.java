import Examples.calculadoraJava;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraJavaTest {

    @Test
    void sum() {
        calculadoraJava cal = new calculadoraJava();
        int a = 10;
        int b = 20;

        int result = 30;

        assertEquals(result, cal.sum(a,b));

    }
}