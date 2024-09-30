class Solution {
    String ans = "a";
    public void addStr(char ch){
        int value = ch - 122 + 97;
        while(value < 'a'){
            value += 26;
        }
        ans += (char) value;
    }
    public char kthCharacter(int k) {
        while(ans.length() < k){
            int curlen = ans.length();
            for(int i = 0; i < curlen; i++){
                addStr(ans.charAt(i));
            }
        }
        return ans.charAt(k - 1);
    }
}