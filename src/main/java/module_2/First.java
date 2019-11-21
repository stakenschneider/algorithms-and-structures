package module_2;

import java.lang.*;
import java.util.Scanner;

//Построение кучи
public class First {
    private static StringBuilder builder = new StringBuilder();
    static private int count = 0;

    private void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            count++;
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            builder.append(i).append(" ").append(smallest).append("\n");
            heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        First ob = new First();
        ob.sort(arr);

        System.out.println(count);
        System.out.print(builder.toString());
    }
}
