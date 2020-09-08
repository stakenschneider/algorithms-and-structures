package hackerRank.problem_solving.test_basic;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result_1 {
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : dictionary) {
            String sort = sort(word);
            map.put(sort, map.getOrDefault(sort, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (String q : query) {
            list.add(map.getOrDefault(sort(q), 0));
        }

        return list;
    }

    static String sort(String str) {
        char[] wordChars = str.toCharArray();
        Arrays.sort(wordChars);
        return String.valueOf(wordChars);
    }
}

public class Solution_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<Integer> result = Result_1.stringAnagram(dictionary, query);

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

