class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(words[i].length() > words[j].length() && words[i].contains(words[j]) && !res.contains(words[j])){
                    res.add(words[j]);
                }
            }
        }
        return res;
    }
}