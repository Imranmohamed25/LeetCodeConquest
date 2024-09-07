class Solution {
    //ArrayList<String> list = new ArrayList<>();
    String ans = "";
    public void reverse(String word){
        String rev = "";
        for(int i = word.length() - 1; i >= 0; i--){
            rev += word.charAt(i);
        }
        ans += rev + " ";
        //list.add(rev);
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            reverse(arr[i]);
        }
        // String res = "";
        // for(int i = 0; i < list.size(); i++){
        //     res += list.get(i);
        //     if(i != list.size() - 1){
        //         res += " ";
        //     }
        // }
        return ans.trim();
    }
}