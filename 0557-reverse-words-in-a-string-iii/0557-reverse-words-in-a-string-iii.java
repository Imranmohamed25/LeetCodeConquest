class Solution {
    StringBuilder ans = new StringBuilder();
    public void reverse(String word) {
        StringBuilder rev = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }
        if (ans.length() > 0) {
            ans.append(" ");
        }
        ans.append(rev);
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
        return ans.toString();
    }
}
