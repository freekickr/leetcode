package Easy;

/*
Smallest Range I

Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
After this process, we have some array B.
Return the smallest possible difference between the maximum value of B and the minimum value of B.

Example 1:
    Input: A = [1], K = 0
    Output: 0
    Explanation: B = [1]

Example 2:
    Input: A = [0,10], K = 2
    Output: 6
    Explanation: B = [2,8]

Example 3:
    Input: A = [1,3,6], K = 3
    Output: 0
    Explanation: B = [3,3,3] or B = [4,4,4]

Note:
    1 <= A.length <= 10000
    0 <= A[i] <= 10000
    0 <= K <= 10000
 */


import java.util.Arrays;

//omg description is insane
public class SmallestRangeI {

    public static int smallestRangeI(int[] A, int K) {
        int[] temp = A;
        Arrays.sort(temp);
        return Math.max(0, temp[temp.length-1] - temp[0] - 2*K);
    }

    public static int smallestRangeI2(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int i : A) {
            if (i > max)
                max = i;
            else if (i < min)
                min = i;
        }
        return Math.max(0, max - min - 2*K);
    }

    public static int smallestRangeI3(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x: A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2*K);
    }

    public static void main(String[] args) {
        System.out.println(smallestRangeI3(new int[] {0,10}, 2));
    }
}