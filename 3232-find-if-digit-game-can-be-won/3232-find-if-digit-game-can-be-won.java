class Solution {
    public boolean canAliceWin(int[] nums) {
        int a1 = 0, b2 = 0;
        int b1 = 0, a2 = 0;
        for(int i = 0; i < nums.length; i++){
            int dig = 0;
            int temp = nums[i];
            while(temp > 0){
                dig++;
                temp = temp / 10;
            }
            if(dig == 2){
                a1 += nums[i];
                b2 += nums[i];
            }
            else{
                b1 += nums[i];
                a2 += nums[i];
            }
        }
        if( a1 > b1 || a2 > b2){
            return true;
        }
        return false;
    }
}