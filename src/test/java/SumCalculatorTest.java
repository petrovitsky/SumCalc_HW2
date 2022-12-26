import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void shouldReturnOneWhenGivenOne() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnSixWhenGivenThree() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldThrowillegalargumentexceptionWhenGivenLessThanOne() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> calculator.sum(0));
    }
}
