package Easy;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //all of these methods were sorted according to runtime (descending)

    public static int[] twoSum1(int[] nums, int target) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int i : nums) numsList.add(i);
        for (int i = 0; i < numsList.size();i++ ) {
            int temp = numsList.indexOf(target - numsList.get(i));
            if (temp != -1 && temp != i)
                return new int[] {i, temp};
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] {i, j};
            }
        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            numsMap.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (numsMap.containsKey(temp) && numsMap.get(temp) != i)
                return new int[] {i, numsMap.get(temp)};
        }
        return null;
    }

    public static int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (numsMap.containsKey(temp))
                return new int[] {numsMap.get(temp), i};
            numsMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = twoSum4(new int[] {3,2,4}, 6);
        for (int i : result)
            System.out.print(i + " ");
    }
}
