class Solution {
    public boolean isPerfectSquare(int num) {
        double sqRoot = Math.sqrt(num);
        if(num % sqRoot == 0 || num == 1){
            return true;
        }
        return false;
    }
}