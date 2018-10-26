package Easy;

/*
Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
    Input: 123
    Output: 321

Example 2:
    Input: -123
    Output: -321

Example 3:
    Input: 120
    Output: 21

Note:
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
    −2,147,483,648 (−2^31) through 2,147,483,647 (2^31 − 1)
*/

public class ReverseInteger {

    public static int reverse(int x) {
        try {
            if (x >= 0)
                return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            else
                return -Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverse2(int x) {
        int res = 0;
        int temp = 0;
        while(x != 0){
            int tail = x%10;
            temp = res*10 + tail;
            if((temp - tail)/10 != res) // judge whether res is flow out.
                return 0;
            res = temp;
            x = x/10;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}