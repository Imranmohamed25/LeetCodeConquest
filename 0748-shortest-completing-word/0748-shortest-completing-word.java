class Solution {
    ArrayList<String> ans = new ArrayList<>();

    public void check(String s, char[] lp) {
        boolean[] b = new boolean[lp.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < lp.length; j++) {
                if (s.charAt(i) == lp[j] && !b[j]) {
                    b[j] = true;
                    break;
                }
            }
        }
        for (int k = 0; k < b.length; k++) {
            if (b[k] == false) {
                return;
            }
        }
        ans.add(s);
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lp = licensePlate.toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < words.length; i++) {
            check(words[i], lp.toCharArray());
        }
        String result = ans.get(0);
        for (String word : ans) {
            if (word.length() < result.length()) {
                result = word;
            }
        }
        return result;
    }
}