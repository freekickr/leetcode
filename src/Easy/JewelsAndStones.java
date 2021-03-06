package Easy;

/*
Jewels and Stones

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
    Input: J = "aA", S = "aAAbbbb"
    Output: 3

Example 2:
    Input: J = "z", S = "ZZ"
    Output: 0

Note:
    S and J will consist of letters and have length at most 50.
    The characters in J are distinct.
 */

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    //methods were sorted depends on runtime (descending)

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < J.length(); i++)
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == J.charAt(i))
                    result++;
            }
        return result;
    }

    public static int numJewelsInStones2(String J, String S) {
        char[] js = J.toCharArray();
        char[] ss = S.toCharArray();
        int result = 0;
        for (int i = 0; i < js.length; i++)
            for (int j = 0; j < ss.length; j++) {
                if (ss[j] == js[i])
                    result++;
            }
        return result;
    }

    public static int numJewelsInStones3(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (char ch : J.toCharArray())
            set.add(ch);
        int count = 0;
        for (char c : S.toCharArray()){
            if(set.contains(c))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}