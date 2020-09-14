package hackerRank.thirtyDaysOfCode;

import java.util.*;
// More Exceptions
class Day_17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

    private static class Calculator {
        private int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }
            if (p == 0) {
                return 1;
            }
            int res = n;
            for (int i = 1; i < p; i++) {
                res = res * n;
            }
            return res;
        }
    }
}