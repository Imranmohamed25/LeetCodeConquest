class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cost = 5;
        int profit = 0;
        int change5 = 0;
        int change10 = 0;
        int change20 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                change5++;
            }
            else if(bills[i] == 10){
                if(change5 == 0){
                    return false;
                }
                change5--;
                change10++;
            }
            else if(bills[i] == 20){
                if(change5 > 0 && change10 > 0){
                    change5--;
                    change10--;
                }
                else if(change5 >= 3){
                    change5 -= 3;
                }
                else{
                    return false;
                }
            }
        }
        // System.out.println(change5);
        // System.out.println(change10);
        // System.out.println(change20);
        return true;
      
    }
}

/*
  int cost = 5;
      int profit = 0;
      int change = 0;
      for(int i = 0; i < bills.length; i++){
        change = bills[i] - cost;
        profit += 5;
        if(change > profit){
            return false;
        }
      }
      return true;
*/