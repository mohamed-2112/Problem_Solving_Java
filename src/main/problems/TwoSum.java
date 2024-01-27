package main.problems;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int compliment;

        for (int i=0; i<nums.length; i++){
            compliment = target - nums[i];
            if (numMap.containsKey(compliment)){
                return new int[] {numMap.get(compliment), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
