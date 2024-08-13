public class Solution {
    public double minimumAverage(int[] nums) {
        if (nums.length == 0) 
        return 0;

        Arrays.sort(nums);
        double minAverage = Double.MAX_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double average = (nums[i] + nums[j]) / 2.0;
                if (average < minAverage) {
                    minAverage = average;
                }
            }
        }
        return minAverage;
    }
}