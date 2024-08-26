class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIdx = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIdx = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
        for(int i = 0; i < nums.length; i++){
            int twice = nums[i] * 2;
            if(max < twice && i != maxIdx){
                return -1;
            }
        }
        return maxIdx;
    }
}