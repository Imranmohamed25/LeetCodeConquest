class Solution {
    public String clearDigits(String s) {
        return check(s);
    }
    public String check(String s){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                stk.pop();
            }
        }
        String ans = stk.toString();
        return ans.replaceAll("[^a-z]","");
    }
}