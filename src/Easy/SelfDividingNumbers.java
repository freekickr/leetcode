package Easy;

/*
Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
    Input: left = 1, right = 22
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
    The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            String value = String.valueOf(i);
            if (!value.contains("0")) {
                int quantity = 0;
                for (int j = 0; j < value.length(); j++) {
                    if (i % Character.getNumericValue(value.charAt(j)) == 0)
                        quantity++;
                }
                if (quantity == value.length())
                    result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isDivide(i))
                result.add(i);
        }
        return result;
    }

    private static boolean isDivide(int n) {
        for (char c : String.valueOf(n).toCharArray())
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        return true;
    }

/*  private static boolean isDivide2(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0 || (n % d) > 0)
                return false;
        }
        return true;
    }*/

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers2(1, 22));
    }
}
