import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testBalancedString() {
        // Edge case: Empty string
        assertEquals(0, Solution.balancedString(""));

        // Edge case: String with only one character
        assertEquals(1, Solution.balancedString("Q"));
        assertEquals(1, Solution.balancedString("W"));
        assertEquals(1, Solution.balancedString("E"));
        assertEquals(1, Solution.balancedString("R"));

        // Strings that are already balanced
        assertEquals(0, Solution.balancedString("QWER"));
        assertEquals(0, Solution.balancedString("QQWE"));
        assertEquals(0, Solution.balancedString("QQQW"));

        // Strings needing replacements
        assertEquals(1, Solution.balancedString("QQQE"));
        assertEquals(2, Solution.balancedString("QQQR"));
        assertEquals(2, Solution.balancedString("QQQQ"));

        // Strings needing full replacement
        assertEquals(4, Solution.balancedString("QQQQQQQQ"));
        assertEquals(5, Solution.balancedString("QQQQQEEERRRR"));
    }

    @Test
    public void testRandomCases() {
        // Additional test cases with random strings
        assertEquals(4, Solution.balancedString("QQQWEER")); // Updated expected value
        assertEquals(1, Solution.balancedString("QWQW"));
        assertEquals(3, Solution.balancedString("QQWRQQQ"));
        assertEquals(0, Solution.balancedString("QWQEWRQR"));
    }

    @Test
    public void testLargeInput() {
        // Test with large input
        StringBuilder largeInput = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            largeInput.append("QWER");
        }
        assertEquals(0, Solution.balancedString(largeInput.toString()));
    }
}

