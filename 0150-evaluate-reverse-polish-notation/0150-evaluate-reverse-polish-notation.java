class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                stk.push(stk.pop() + stk.pop());
            } else if (tokens[i].equals("-")) {
                int a = stk.pop();
                stk.push(stk.pop() - a);
            } else if (tokens[i].equals("*")) {
                stk.push(stk.pop() * stk.pop());
            } else if (tokens[i].equals("/")) {
                int b = stk.pop();
                stk.push(stk.pop() / b);
            }
            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.peek();
    }
}