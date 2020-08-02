package HackerRank.interviewPreparationKit.warmUpChallenges;

class CountingValleys {
    static int countingValleys(int n, String s) {
        int v = 0;
        int lvl = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            if (lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }

    public static void main(String[] args) {
        String str = "UDDDUDUU";
        int result = countingValleys(str.length()-1, str);
        System.out.println(result);
    }
}

