package Easy;

/*
Sort Array by Parity I

Given an array A of non-negative integers,
return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Example 1:
    Input: [3,1,2,4]
    Output: [2,4,3,1]

The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Note:
    1 <= A.length <= 5000
    0 <= A[i] <= 5000
 */

import java.util.*;

public class SortArrayByParity {

    //methods were sorted depends on runtime (descending)

    public static int[] sortArrayByParity(int[] A) throws NoSuchElementException {
        Queue<Integer> temp = new ArrayDeque<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0)
                ((ArrayDeque<Integer>) temp).addLast(A[i]);
            else
                ((ArrayDeque<Integer>) temp).addFirst(A[i]);
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++)
            result[i] = ((ArrayDeque<Integer>) temp).pop();
        return result;
    }

    public static int[] sortArrayByParity2(int[] A) {
        int c = 0;
        int temp;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0)
                continue;
            else {
                temp = A[c];
                A[c] = A[i];
                A[i] = temp;
                c++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(0%2);
        int[] result = sortArrayByParity2(new int[] {1,2,3,4,5,6,7,8,9,0});
        for (int i : result)
            System.out.print(i + " ");
    }
}