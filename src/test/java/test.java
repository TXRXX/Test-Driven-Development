import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class test {
    fizzbuzz f1;
    @Test
    @DisplayName("Insert 1")
    void test_FizzBuzz() {
        f1 = new fizzbuzz();
        String output = f1.fz(1);
        assertEquals("1",output);
    }

    @Test
    @DisplayName("Insert 3")
    void test_FizzBuzz2() {
        f1 = new fizzbuzz();
        String output = f1.fz(3);
        assertEquals("Fizz",output);
    }

    @Test
    @DisplayName("Insert 5")
    void test_FizzBuzz3() {
        f1 = new fizzbuzz();
        String output = f1.fz(5);
        assertEquals("Buzz",output);
    }

    @Test
    @DisplayName("Insert 15")
    void test_FizzBuzz4() {
        f1 = new fizzbuzz();
        String output = f1.fz(15);
        assertEquals("FizzBuzz",output);
    }
}
