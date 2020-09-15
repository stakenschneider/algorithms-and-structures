package hackerRank.thirtyDaysOfCode;

import java.util.*;

// Sorting
public class Day_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.\n" +
                "First Element: "+a[0]+"\n" +
                "Last Element: "+a[a.length-1]);
    }
}