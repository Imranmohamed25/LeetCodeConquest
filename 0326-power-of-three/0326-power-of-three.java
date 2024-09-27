class Solution {
    public boolean isPowerOfThree(int n) {
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n/10;
        }
        if(sum % 3 == 0 && sum >= 3)
        return true;
        return false;
    }
}