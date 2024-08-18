class Solution {
    public boolean containsDuplicate(int[] nums) {
        //HashSet hs = new HashSet<>();
        boolean result = false;
        for(int i = 0; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(i != j){
                 if(nums[i] == nums[j]){
                 result = true;
                 break;
                }
            }
        }
    }
     return result;
    }
}