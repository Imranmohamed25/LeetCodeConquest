class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        for(int i = 2; i <= n; i++){
           sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
        //ArrayList<Integer> list = new ArrayList<>();
        //while(sum<n)
        // list.add(sum);