package main.problems;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int result = this.binarySearch(nums, target);
        return 0;
    }
    public int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = (start+end)/ 2;
        System.out.println("the mid before the loop: "+mid);
        if (nums.length == 1){
            if (nums[mid]<target) {
                return mid+1;
            }
            return mid;
        }
        while(start<end && nums[mid] != target){
            System.out.println("the mid in the loop is: " + mid+ " and the number this wierd is: "+nums[mid]);
            if(nums[mid]<target){
                start = mid+1;
                if(mid < nums.length-1 && nums[mid+1]>target) {
                    mid = mid +1;
                    break;
                }
            }else if (nums[mid]>target){
                end = mid-1;
                if(mid > 0 && nums[mid-1]<target) {
                    break;
                }
            }
            mid = (start+end)/2;
            System.out.println(start+" "+end);
            System.out.println(mid);
        }
        if(mid == nums.length-1&&nums[mid]<target){
            mid++;
        }
        System.out.println("the mid is: "+mid);
        return mid;
    }
}
