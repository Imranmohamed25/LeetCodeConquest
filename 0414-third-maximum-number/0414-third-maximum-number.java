class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
               list.add(nums[i]); 
            }
        }
        Collections.sort(list);
        if(list.size()<=2){
            return list.get(list.size()-1);
        }
        else if(list.size()>=3){
            return list.get(list.size()-3);
        }
        
        return 0;
    }
}