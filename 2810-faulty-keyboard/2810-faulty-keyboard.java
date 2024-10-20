class Solution {
    String ans = "";
    public String finalString(String s) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'i'){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) == 'i'){
                ans = reverse(ans);
            }
        }
        return ans;
    }
    public String reverse(String s){
        String rev = "";
        for(int i = s.length() - 1; i >= 0;  i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        return rev;
    }
}