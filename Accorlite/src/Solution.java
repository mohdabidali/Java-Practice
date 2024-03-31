
    public class Solution {
        public static int balancedString(String s) {
            int[] count = new int[128];
            int n = s.length(), res = n, i = 0, k = n / 4;
            for (int j = 0; j < n; ++j) {
                ++count[s.charAt(j)];
            }
            for (int j = 0; j < n; ++j) {
                --count[s.charAt(j)];
                while (i < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
                    res = Math.min(res, j - i + 1);
                    ++count[s.charAt(i++)];
                }
            }
            return res;
        }

        public static void main(String[] args) {
            // Test cases
            String[] testCases = {
                    "QWER",
                    "QQWE",
                    "QQQW",
                    "QQQE",
                    "QQQR",
                    "QQQQ",
                    "QQQQQQQQ",
                    "QQQQQEEERRRR"
            };

            for (String testCase : testCases) {
                int result = balancedString(testCase);
                System.out.println("Input: " + testCase + ", Output: " + result);
            }
        }
    }

