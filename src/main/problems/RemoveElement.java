package main.problems;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int occur = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                System.arraycopy(nums,i+1,nums,i,(nums.length - i - 1));
                nums[nums.length-1] = -1;
                occur++;
                i--;
            }else if(nums[i]==-1){
                break;
            }
        }
        return (nums.length-occur);
    }
}
