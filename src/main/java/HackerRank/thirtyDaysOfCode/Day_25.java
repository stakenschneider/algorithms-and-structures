package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

//Running Time and Complexity
public class Day_25 {

    static void check(int num) {
        if (num == 1) {
            System.out.println("Not prime");
            return;
        }

        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            check(sc.nextInt());
        }
    }
}