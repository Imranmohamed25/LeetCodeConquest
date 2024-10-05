class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        if(!haystack.contains(needle)){
            return -1;
        }
        else if(haystack.contains(needle)){
            index = haystack.indexOf(needle);
        }
        return index;
    }
}