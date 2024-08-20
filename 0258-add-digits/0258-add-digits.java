class Solution {
    public int addDigits(int num) {
        if(num <= 9){
            return num;
        } 
        int add = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            add += rem;
            num = num/10;
        }
        if(add > 9){
            return addDigits(add);
        }
        return add;
    }
}

/*
        int add = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            add += rem;
            num = num/10;
        }
        if(add > 9){
            return addDigits(add);
        }

        return add;
*/