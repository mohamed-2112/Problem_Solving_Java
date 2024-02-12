package main.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        //aacab
        if (s == null || s.isEmpty()) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Assume odd length, try to extend Palindrome as possible
            int len2 = expandAroundCenter(s, i, i + 1); // Assume even length.
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Return length of palindrome

    }


}
// sequence detective
// summation of the matrix layers
// dealership class
// the curse words
// compress and swap
// the last letter of a word and the first word would be compatible and it's ok to change the order of the words