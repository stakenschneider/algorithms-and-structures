package hackerRank.problem_solving.test_basic;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result_2 {
    public static List<String> mostActive(List<String> customers) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String customer : customers) {
            if (hashMap.containsKey(customer)) {
                hashMap.put(customer, hashMap.get(customer) + 1);
            } else {
                hashMap.put(customer, 1);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String,Integer> customer : hashMap.entrySet()) {
            int totalCount = customer.getValue();
            if (((double) totalCount / customers.size() * 100.0) >= 5.0) {
                    result.add(customer.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}

public class Solution_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result_2.mostActive(customers);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
