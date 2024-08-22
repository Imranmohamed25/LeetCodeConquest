class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 1;
        int sum = 0;
        while(n<num){
            if(num % n == 0){
                sum += n;
            }
            n++;
        }
        return sum == num;
    }
}