class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max)
            max = nums[i];
            if(nums[i] < min)
            min = nums[i];
        }
        return Math.max(0, (max - k) - (min + k));
    }
}