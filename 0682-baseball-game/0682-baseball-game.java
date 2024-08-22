class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else if(operations[i].equals("D"))
            {
                int n=stack.peek()*2;
                stack.push(n);
            }
            else if(operations[i].equals("+"))
            {
                int temp1=stack.pop();
                int sum=temp1+stack.peek();
                stack.push(temp1);
                stack.push(sum);
            }
            else
            {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int num=0;
        while(!stack.isEmpty())
        {
            num+=stack.pop();
        }
        return num;
    }
}