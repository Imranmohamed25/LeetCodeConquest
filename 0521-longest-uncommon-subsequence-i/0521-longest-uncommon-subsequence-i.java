class Solution {
    public int findLUSlength(String a, String b) {
        int count = 0;
        int a1 = a.length();
        int b1 = b.length();
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < b1; j++) {
                if (a.charAt(i) != b.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0 && a1 == b1) {
            return -1;
        }
        return Math.max(a1, b1);
    }
}