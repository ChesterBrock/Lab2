package lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class squareTest {

    @Test
    void square() {
        square test = new square();
        int output = test.square(5);
        assertEquals(25,output);
    }

    @Test
    void cube() {
        square test = new square();
        int output = test.cube(5);
        assertEquals(125,output);
    }
}