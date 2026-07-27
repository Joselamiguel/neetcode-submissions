class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("D")){
                int x = Integer.parseInt(stack.peek()) * 2;
                stack.push(String.valueOf(x));
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("+")){
                int temp = Integer.parseInt(stack.pop());
                int temp2 = Integer.parseInt(stack.pop());
                int sum = temp + temp2;
                stack.push(String.valueOf(temp2));
                stack.push(String.valueOf(temp));
                stack.push(String.valueOf(sum));
            }
            else{
                stack.push(operations[i]);
            }
        }
        int output = 0;
        while(!stack.empty()){
            output+= Integer.parseInt(stack.pop());
        }
        return output;
    }
}