class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] list = s.toCharArray();
        for(int i=0;i<list.length;i++){
            if(stack.empty()){
                stack.push(list[i]);
                continue;
            }
            if(list[i] == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                } else{
                    return false;
                }
            } else if(list[i] == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                } else{
                    return false;
                }
            } else if(list[i] == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                } else{
                    return false;
                }
            } else {
                stack.push(list[i]);
            }
        }
        if(stack.empty() == true){
            return true;
        } else {
            return false;
        }
    }
}
