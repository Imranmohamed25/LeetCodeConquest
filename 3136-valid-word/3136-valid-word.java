class Solution {
    public boolean isValid(String word) {
        //String num = word.replaceAll("[^0-9]", ""); || num.length() < 1
        String spl = word.replaceAll("[0-9a-zA-Z]", "");
        if (word.length() < 3 || spl.length() > 0) {
            return false;
        }
        String vow = "aeiou";
        String cons = "bcdfghjklmnpqrstvwxyz";
        int cntV = 0;
        String w = word.toLowerCase();
        for (int i = 0; i < w.length(); i++) {
            for (int j = 0; j < vow.length(); j++) {
                if (w.charAt(i) == vow.charAt(j)) {
                    cntV++;
                }
            }
        }
        int cntC = 0;
        for (int i = 0; i < w.length(); i++) {
            for (int j = 0; j < cons.length(); j++) {
                if (w.charAt(i) == cons.charAt(j)) {
                    cntC++;
                }
            }
        }
        if(cntV > 0 && cntC > 0){
            return true;
        }
        return false;
    }
}