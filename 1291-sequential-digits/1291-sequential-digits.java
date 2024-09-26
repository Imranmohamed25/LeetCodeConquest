class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String digits = "123456789";
        for (int len = 2; len <= 9; len++) {
            for (int start = 0; start + len <= digits.length(); start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }
        
        return list;
    }
}