package hackerRank.developerSoft;

import java.io.*;
import java.math.*;

class Result_1 {
    static BigInteger calculateFactorial(int n){
        BigInteger  result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i ++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static BigInteger combination(int n) {
        if (n >= 3) {
            if (n > 3) {
                return calculateFactorial(n).divide((calculateFactorial(n - 3).multiply(calculateFactorial(3))));
            } else {
                return BigInteger.valueOf(1);
            }
        } else {
            return BigInteger.valueOf(0);
        }
    }


    public static int diverseDeputation(int m, int w) {
        if (w < 1 || m < 1) return 0;
        BigInteger all = combination(w + m);
        return ( all.subtract(combination(w)).subtract(combination(m))).intValue();
    }

}
class Solution_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int w = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result_1.diverseDeputation(m, w);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}