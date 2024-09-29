class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            min = Math.min(arr[i + 1] - arr[i], min);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            List<Integer> list = new ArrayList<>();
            if(arr[i + 1] - arr[i] == min){
                list.add(arr[i]);
                list.add(arr[i + 1]);
            }
            if(list.size() != 0){
                ans.add(list);
            }
        }
        return ans;
    }
}