package hackerRank.problem_solving.medium;

import java.io.*;
import java.util.*;


public class OrganizingContainersOfBalls {
    static String organizingContainers(int[][] container) {
        int spaceInContainer[] = new int[container.length];
        int color[] = new int[container.length];

        for (int i = 0; i < container.length; i++) { //столбцы
            for (int j = 0; j < container[i].length; j++) { //строки
                spaceInContainer[i] = spaceInContainer[i] + container[i][j];
                color[j] = color[j] + container[i][j];
            }
        }

        Arrays.sort(spaceInContainer);
        Arrays.sort(color);

        if(!Arrays.equals(spaceInContainer, color)) {
            return "Impossible";
        } else return "Possible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 3;
        array[0][2] = 1;

        array[1][0] = 2;
        array[1][1] = 1;
        array[1][2] = 3;

        array[2][0] = 3;
        array[2][1] = 3;
        array[2][2] = 3;
        String result = organizingContainers(array);
        System.out.println(result);
    }
}
