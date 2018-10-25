package Easy;

/*
Sort Array by Parity III

Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
You may return any answer array that satisfies this condition.

Example 1:
    Input: [4,2,5,7]
    Output: [4,5,2,7]
    Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Note:
    2 <= A.length <= 20000
    A.length % 2 == 0
    0 <= A[i] <= 1000
 */

public class SortArrayByParityIII {

    //Faster
    public static int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0, even = 0, odd = 1; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                result[odd] = A[i];
                odd += 2;
            } else {
                result[even] = A[i];
                even +=2;
            }
        }
        return result;
    }


    //Slower
    public static int[] sortArrayByParityII2(int[] A) {
        for (int i = 0, j = 1; i < A.length; i += 2)
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        return A;
    }

    public static void main(String[] args) {
        int[] result = sortArrayByParityII(new int[] {1,2,3,4});
        for (int i : result)
            System.out.print(i + " ");
    }
}