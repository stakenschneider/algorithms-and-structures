package hackerRank.problem_solving.medium;

import java.util.ArrayList;
import java.util.List;

public class ClimbingTheLeaderBoard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] res = new int[alice.length];
        List<Integer> ranking = new ArrayList<>();
        ranking.add(1);
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i - 1]) {
                ranking.add(ranking.get(i - 1));
            } else {
                ranking.add(ranking.get(i - 1) + 1);
            }
        }

        int index = scores.length - 1;

        for (int k = 0; k < alice.length; k++) {
            if (alice[k] > scores[0]) {
                res[k] = 1;
            } else if (alice[k] < scores[scores.length - 1]) {
                res[k] = ranking.get(ranking.size() - 1)+1;
            } else{
                for (int i = index; i >= 0; i--) {
                    if (scores[i] == alice[k]) {
                        res[k] = ranking.get(i);
                        index = i;
                        break;
                    }

                    if (scores[i] > alice[k] && scores[i + 1] < alice[k]) {
                        res[k] = ranking.get(i + 1);
                        index = i;
                        break;
                    }

                }}
        }

        return res;
    }

    public static void main(String[] args) {

        int[] score = new int[7];
        score[0] = 100;
        score[1] = 100;
        score[2] = 50;
        score[3] = 40;
        score[4] = 40;
        score[5] = 20;
        score[6] = 10;

        int[] alice = new int[4];
        alice[0] = 5;
        alice[1] = 25;
        alice[2] = 50;
        alice[3] = 120;

        climbingLeaderboard(score, alice);
    }
}
