class Solution {
    public boolean canWinNim(int n) {
        if (n % 4 == 0) {
            return false;
        }
        int i = 1;
        int a = 0;
        int b = n;
        while (i <= n) {
            a += i;
            b -= i;
            i++;
            n--;
        }
        return a >= b;
    }
}