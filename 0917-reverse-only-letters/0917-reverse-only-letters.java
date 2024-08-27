class Solution {
    public String reverseOnlyLetters(String s) {
        String ans = "";
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ans += s.charAt(i);
            }
        }
        //System.out.print(ans);

        int j = 0;
        int resSize = s.length() - ans.length();
        //System.out.print(resSize);

        for (int i = 0; i < ans.length() + resSize; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                result += ans.charAt(j);
                j++;
            }
            else{
                result += s.charAt(i);
            }
        }
        return result;
    }
}

// int st = 0;
// int end = s.length()-1;
// int temp = 0;