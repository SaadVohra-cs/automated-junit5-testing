public class RangeChecker {
    public static int multAccumBigIntegerRangeCheck(int oldAcc, int newVal, int scale) {
        // We use 'long' to perform the math because it can hold values much larger than 'int'
        long result = (long) oldAcc + ((long) newVal * (long) scale);

        // If the result is outside the bounds of a standard 32-bit Integer, we throw the exception
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Overflow occurred!");
        }
        return (int) result;
    }
}