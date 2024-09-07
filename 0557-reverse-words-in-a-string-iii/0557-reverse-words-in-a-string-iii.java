class Solution {
    String ans = "";
    public void reverse(String word){
        String rev = "";
        for(int i = word.length() - 1; i >= 0; i--){
            rev += word.charAt(i);
        }
        ans += rev;
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            reverse(arr[i]);
                if (i != arr.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}