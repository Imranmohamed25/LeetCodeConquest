class Solution {
    String key[] = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        String ans = "";
        return Keypress(digits, ans, list);
    }
    public List<String> Keypress(String digits, String result, ArrayList<String> list){
        if(digits.length() == 0){
            list.add(result);
        }
        if(digits.length() != 0){
        char ch = digits.charAt(0);
        String press = key[ch - '0'];
        for(int i = 0; i < press.length(); i++){
            Keypress(digits.substring(1), result + press.charAt(i), list);
        }
        }
        return list;
    }
}