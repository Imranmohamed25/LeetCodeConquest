class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int a = 0;
        int b = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[a] = nums[i];
                a = a + 2;
            }
            else if (nums[i] % 2 != 0) {
                result[b] = nums[i];
                b = b + 2;
            }
        }
        return result;
    }
}