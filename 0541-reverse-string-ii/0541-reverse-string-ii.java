class Solution {
    public String reverseStr(String s, int k) {
        String ans = "";
        for(int i = 0; i < s.length(); i = i + (k * 2)){
            Stack<Character> stk = new Stack<>();
            for(int j = i; j < i + k && j < s.length(); j++){
                stk.push(s.charAt(j));
            }
            while(!stk.isEmpty()){
                ans += stk.pop();
            }
            for(int l = i + k; l < i + (k * 2) && l < s.length(); l++){
                ans += s.charAt(l);
            }
        }
        return ans;
    }
}