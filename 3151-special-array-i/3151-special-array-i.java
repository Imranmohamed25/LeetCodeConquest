class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length < 2){
            return true;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] % 2 == 0 && nums[j] % 2 != 0 || nums[i] % 2 != 0 && nums[j] % 2 == 0){
                    count++;
                }
                break;
            }
        }
        if(count == nums.length - 1){
            return true;
        }
        return false;
    }
}