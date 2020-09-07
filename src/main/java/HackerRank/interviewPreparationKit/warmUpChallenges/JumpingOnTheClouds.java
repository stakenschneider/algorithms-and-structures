package hackerRank.interviewPreparationKit.warmUpChallenges;

public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) i++;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] c = {0,0,0,1,0,0};
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }
}

