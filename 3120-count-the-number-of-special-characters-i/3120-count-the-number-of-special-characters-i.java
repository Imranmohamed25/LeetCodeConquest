class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character> caps = new ArrayList<>();
        ArrayList<Character> small = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z' && !caps.contains(ch)) {
                caps.add(Character.toLowerCase(ch));
            } else if (ch >= 'a' && ch <= 'z' && !small.contains(ch)) {
                small.add(ch);
            }
        }
        if (caps.isEmpty() || small.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < small.size(); i++) {
            if (caps.contains(small.get(i))) {
                count++;
            }
        }
        //System.out.println(caps + " " + small);
        return count;
    }
}