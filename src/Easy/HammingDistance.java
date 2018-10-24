package Easy;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x^y).replaceAll("0","").length();
    }

    public static int hammingDistance2(int x, int y) {
        char[] bits = Integer.toBinaryString(x^y).toCharArray();
        int result = 0;
        for (int i = 0; i < bits.length; i++)
            if (bits[i] == '1')
                result++;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance2(1,231));
    }
}
