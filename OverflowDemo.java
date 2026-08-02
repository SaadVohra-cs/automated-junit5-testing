public class OverflowDemo {
    public static void main(String[] args) {
        // Part A: Silent Overflow (The "bad" way)
        int min = Integer.MIN_VALUE;
        int resultSilent = min + min;
        System.out.println("Part A - Silent Overflow: " + resultSilent); // Results in 0

        // Part B: Managed Overflow (The "secure" way)
        try {
            System.out.println("Part B - Testing for Exception...");
            int resultManaged = Math.addExact(min, min);
            System.out.println("Result: " + resultManaged);
        } catch (ArithmeticException e) {
            System.out.println("Part B - Success: Caught the overflow exception! Runtime continues.");
        }
    }
}
