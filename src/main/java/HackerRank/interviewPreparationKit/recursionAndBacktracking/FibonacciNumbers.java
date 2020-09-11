package hackerRank.interviewPreparationKit.recursionAndBacktracking;

import java.util.*;

class FibonacciNumbers {
    public static int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
