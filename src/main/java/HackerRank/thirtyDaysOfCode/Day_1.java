package hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "hackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i_2 = 0;
        double d_2 = 0.0;
        String s_2 = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i_2 = scan.nextInt();
        d_2 = scan.nextDouble();
        scan.nextLine();
        s_2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i_2);
        System.out.println(d+d_2);
        System.out.println(s+s_2);

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
