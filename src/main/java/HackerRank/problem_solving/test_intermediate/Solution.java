package hackerRank.problem_solving.test_intermediate;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> findSubsequence(List<Integer> numbers, int k) {
        Object[] original = numbers.toArray();
        numbers.sort(Integer::compareTo);

        int high = numbers.get(numbers.size() - 1);

        int[] divisors = new int[high + 1];
        for (Integer integer : numbers) {
            for (int j = 1; j * j <= integer; j++) {
                if (integer % j == 0) {
                    divisors[j]++;
                    if (j != integer / j) {
                        divisors[integer / j]++;
                    }
                }
            }
        }

        int maxGcd;
        for (maxGcd = high; maxGcd >= 1; maxGcd--) {
            if (divisors[maxGcd] >= k) {
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Object number : original) {
            if ((int) number % maxGcd == 0) {
                result.add((int) number);
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.findSubsequence(numbers, k);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
