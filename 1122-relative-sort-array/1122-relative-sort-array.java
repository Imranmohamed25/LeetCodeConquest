class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int curr = 0;
        Arrays.sort(arr1);
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    ans[curr] = arr1[j];
                    curr++;
                }
            }
        }
        //System.out.println(curr);
        for(int i = 0; i < arr1.length; i++){
            int b = 0;
            for(int j =0; j < arr2.length; j++){
                if(arr1[i] != arr2[j]){
                    b++;
                }
            }
            if(b == arr2.length){
                ans[curr] = arr1[i];
                curr++;
            }
        }
        return ans;
    }
}