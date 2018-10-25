package Easy;

/*
To Lower Case

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
    Input: "Hello"
    Output: "hello"

Example 2:
    Input: "here"
    Output: "here"

Example 3:
    Input: "LOVELY"
    Output: "lovely"
 */

public class ToLowerCase {

    //methods were sorted depends on runtime (descending)

    public static String toLowerCase(String str) {
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= 'A' && temp[i] <= 'Z')
                temp[i] = (char) (temp[i] + 32);
        }
        return new String(temp);
    }

    public static String toLowerCase2(String str) {
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++)
            temp[i] = Character.toLowerCase(temp[i]);
        return new String(temp);
    }

    public static String toLowerCase3(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase2("LOVELY"));
        System.out.println(toLowerCase3("ASSTZ234asdZA"));
    }
}
