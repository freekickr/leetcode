package Easy;

/*
Peak Index in a Mountain Array

Let's call an array A a mountain if the following properties hold:
    A.length >= 3
    There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:
    Input: [0,1,0]
    Output: 1

Example 2:
    Input: [0,2,1,0]
    Output: 1

Note:
    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A is a mountain, as defined above.
 */

public class PeakIndexInAMtnArray {

    public static int peakIndexInMountainArray(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length - 1;i++) {
            if (A[i] > A[i+1]) {
                return result;
            }
            result++;
        }
        return result;
    }

    public static int peakIndexInMountainArray2(int[] A) {
        int i = 0;
        while (A[i] < A[i+1])
            i++;
        return i;
    }

    public static int peakIndexInMountainArray3(int[] A) {
        int low = 0, high = A.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (A[mid] < A[mid + 1])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static int peakIndexInMountainArray4(int[] A) {
        for(int i=1;i<A.length;i++){
            if((A[i] < A[i-1])){
                return i-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray4(new int[] {0,1,0}));
    }
}