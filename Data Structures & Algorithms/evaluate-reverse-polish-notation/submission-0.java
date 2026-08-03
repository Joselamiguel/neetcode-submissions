class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int a  = stack.pop();
                int b = stack.pop();
                int sum = a+b;
                stack.push(sum);
            }
            else if(tokens[i].equals("*")){
                int a  = stack.pop();
                int b = stack.pop();
                int sum = a*b;
                stack.push(sum);
            }
            else if(tokens[i].equals("/")){
                int a  = stack.pop();
                int b = stack.pop();
                int sum = b/a;
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                int a  = stack.pop();
                int b = stack.pop();
                int sum = b-a;
                stack.push(sum);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            } 
        }
        return stack.pop();
    }
}
