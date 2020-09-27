package hackerRank.interviewPreparationKit.greedyAlgorithms;

import java.util.*;

public class MinAbsDifference {
    static int minimumAbsoluteDifference(int[] arr) {
        int minAbs = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++)
            minAbs = Math.min(minAbs, Math.abs(arr[i + 1] - arr[i]));

        return minAbs;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new int[]{3, -7, 0}));
    }
}

