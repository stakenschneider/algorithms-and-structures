package hackerRank.problem_solving.warmUp;

import java.util.*;

class Solution_1 {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        int max = arr[4];
        int min = arr[0];
        long sum = 0L;

        for (int i = 0; i<5;i++){
            sum += arr[i];
        }

        System.out.print((sum-max)+" "+(sum-min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
