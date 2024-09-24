class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<String> list = new ArrayList<>();
        for(String s:words){
            String str = "";
            for(int i = 0; i < s.length(); i++){
                str += code[s.charAt(i) - 'a'];
            }
            if(!list.contains(str)){
                list.add(str);
            }
        }
    return list.size();
    }
}