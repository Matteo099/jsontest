package unicam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    void testMultiply() {
        MyClass tester = new MyClass();
        assertEquals(50, tester.multiply(10, 5));
    }

    @Test
    void failingTest(){
        fail("This method will fail");
    }
}