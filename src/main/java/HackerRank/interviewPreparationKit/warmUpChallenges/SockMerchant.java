package HackerRank.interviewPreparationKit.warmUpChallenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        List<Integer> arrayList = IntStream.of(ar) .boxed().collect(Collectors.toList());
        int result = 0;

        while (!arrayList.isEmpty()){
            int sock = arrayList.get(0);
            arrayList.remove(0);

            for(int k = 0; !arrayList.isEmpty() && k<arrayList.size(); k++){
                if (sock == arrayList.get(k)){
                    arrayList.remove(k);
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(input.length, input);
        System.out.println(result);
    }
}