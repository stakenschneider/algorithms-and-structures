package hackerRank.thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Queues and Stack
public class Day_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            char a = p.popCharacter();
            char b = p.dequeueCharacter();
            if (a != b) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    private static class Solution{
        private List<Character> stackArray = new ArrayList<>();
        private List<Character> queueArray = new ArrayList<>();

        private void pushCharacter(final char element){
            stackArray.add(element);
        }

        private char popCharacter(){
            char res = stackArray.get(stackArray.size()-1);
            stackArray.remove(stackArray.size()-1);
            return res;
        }

        private void enqueueCharacter(final char element){
            queueArray.add(element);
        }

        private char dequeueCharacter(){
            char res = queueArray.get(0);
            queueArray.remove(0);
            return res;
        }
    }
}
