import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RangeCheckerTest {
    @ParameterizedTest
    @CsvSource({
            "-2147483648, -2147483648, -2147483648",
            "2147483647, 2147483647, -2147483648",
            "2147483647, -2147483648, -2147483648",
            "2147483647, 2147483647, 2147483647",
            "-2147483648, 2147483647, -2147483648",
            "-2147483648, -2147483648, 2147483647",
            "2147483647, -2147483648, 2147483647",
            "-2147483648, 2147483647, 2147483647"
    })
    void testOverflows(int oldAcc, int newVal, int scale) {
        // This confirms that an overflow exception occurs in each test
        assertThrows(ArithmeticException.class, () -> {
            RangeChecker.multAccumBigIntegerRangeCheck(oldAcc, newVal, scale);
        });
    }
}