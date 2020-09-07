package hackerRank.interviewPreparationKit.warmUpChallenges;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count = s.chars().filter(ch -> ch == 'a').count();
        count *= (n / s.length());
        count += s.substring(0, (int)(n % s.length())).chars().filter(ch -> ch == 'a').count();;
        return count;
    }

    public static void main(String[] args) {
        long result = repeatedString("a", 1000000000000L);
        System.out.println(result);
    }
}
