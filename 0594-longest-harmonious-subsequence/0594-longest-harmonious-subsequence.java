class Solution {
    public int maxm(int[] nums) {
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > m)
                m = nums[i];
        }
        return m;
    }

    public int minm(int[] nums) {
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < m)
                m = nums[i];
        }
        return m;
    }

    public int findLHS(int[] nums) {
    int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int countCurrent = 0;
            int countAdjacent = 0;
            boolean hasAdjacent = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    countCurrent++;
                } else if (nums[j] == nums[i] + 1) {
                    countAdjacent++;
                    hasAdjacent = true;
                }
            }

            if (hasAdjacent) {
                maxLength = Math.max(maxLength, countCurrent + countAdjacent);
            }
        }

        return maxLength;
    }
}