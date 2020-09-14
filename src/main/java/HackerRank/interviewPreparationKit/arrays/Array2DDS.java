package hackerRank.interviewPreparationKit.arrays;

public class Array2DDS {
    static int hourglassSum(int[][] arr) {
        int result = Integer.MIN_VALUE;

        int[][] hour = new int[3][3];
        hour[0][0] = 1;
        hour[0][1] = 1;
        hour[0][2] = 1;

        hour[1][0] = 0;
        hour[1][1] = 1;
        hour[1][2] = 0;

        hour[2][0] = 1;
        hour[2][1] = 1;
        hour[2][2] = 1;

        for (int a = 0; a < arr.length - hour.length + 1; a++) {
            for (int b = 0; b < arr[0].length - hour[0].length + 1; b++) {

                int sum = 0;
                for (int i = a; i < hour.length + a; i++) {
                    for (int j = b; j < hour.length + b; j++) {
                        sum += arr[i][j] * hour[i - a][j - b];
                    }
                }
                result = Math.max(result, sum);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;
        array[0][3] = 3;

        array[1][0] = 0;
        array[1][1] = 1;
        array[1][2] = 2;
        array[1][3] = 3;

        array[2][0] = 0;
        array[2][1] = 1;
        array[2][2] = 2;
        array[2][3] = 3;

        System.out.println(hourglassSum(array));
    }
}
