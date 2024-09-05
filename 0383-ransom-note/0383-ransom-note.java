class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++) {
            int count = 0;
            for (int j = 0; j < mag.length; j++) {
                if (ransomNote.charAt(i) == mag[j]) {
                    count++;
                    mag[j] = '/';
                    break;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }
}