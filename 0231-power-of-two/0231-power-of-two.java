class Solution {
    public boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (n % 2 == 0)
            n = n / 2;
            else
            break;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}
