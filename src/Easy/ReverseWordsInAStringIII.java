package Easy;

/*
Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
    Input: "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"

Note:
    In the string, each word is separated by single space and there will not be any extra space in the string.
 */

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String str = sb.toString();
        String[] arr = str.split(" +");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ",arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords2("Let's take LeetCode contest"));
    }
}
