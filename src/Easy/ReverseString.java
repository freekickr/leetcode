package Easy;

/*
Reverse String

Write a function that takes a string as input and returns the string reversed.

Example 1:
    Input: "hello"
    Output: "olleh"

Example 2:
    Input: "A man, a plan, a canal: Panama"
    Output: "amanaP :lanac a ,nalp a ,nam A"
 */

public class ReverseString {

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString2(String s) {
        int len = s.length();
        char[] c = new char[len];
        for(int i = len-1; i >= 0; i--){
            c[len - i - 1] = s.charAt(i);
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(reverseString2("hello"));
    }
}
