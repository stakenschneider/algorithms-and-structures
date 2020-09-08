package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

// Loops
public class Day_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printTable(n);
    }

    static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
