class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}

/*       int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            else if(nums[i] != target){
                if(nums[i] < target){
                    return i+1;
                }
            }
        }
        return 0;
    }
*/