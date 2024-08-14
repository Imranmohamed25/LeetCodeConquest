class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        ArrayList<Integer> clr = new ArrayList<>();
        for(int i = 0; i < colors.length; i++){
            clr.add(colors[i]);
        }
        clr.add(colors[0]);
        clr.add(colors[1]);
        int count = 0;
        for(int i = 0; i < clr.size() - 2; i++){
            if(clr.get(i) != clr.get(i + 1) && clr.get(i + 1) != clr.get(i + 2)){
                count++;
            }
        }
        return count;
    }
}