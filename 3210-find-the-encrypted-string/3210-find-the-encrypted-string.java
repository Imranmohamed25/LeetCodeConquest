class Solution {
    public String getEncryptedString(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            char temp = arr[0];
            for(int j = 0; j < n - 1; j++){
               arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }       
        return new String(arr);
    }
}