class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                int a = s.charAt(i) + 32;
                char ch = (char) a;
                ans += ch;
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}