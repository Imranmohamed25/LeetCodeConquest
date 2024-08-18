import java.util.ArrayList;

class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        
        while (list.size() < n) {
            int next2 = list.get(i2) * 2;
            int next3 = list.get(i3) * 3;
            int next5 = list.get(i5) * 5;
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            list.add(nextUgly);
            
            if (nextUgly == next2) i2++;
            if (nextUgly == next3) i3++;
            if (nextUgly == next5) i5++;
        }
        
        return list.get(list.size() - 1);
    }
}
