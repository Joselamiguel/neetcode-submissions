class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack1 = new Stack<>();
        int counter = 1;
        int position = 0;
        int[] output = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++){
            if(i == temperatures.length -1){
                if(position == temperatures.length -1){
                    output[position] = 0;
                    break;
                }
                else{
                    if(temperatures[i]>temperatures[position]){
                    stack1.push(temperatures[i]);
                    output[position] = counter;
                    position++;
                    for(int x = 0; x<counter-1; x++){
                        stack1.pop();
                    }
                    counter = 1;
                    i=position;
                    continue;
            } else{
                for(int x = 0; x<counter-1; x++){
                    stack1.pop();
                }
                output[position] = 0;
                counter = 1;
                position++;
                i= position;
                continue;    
            }
            }
            }
            if(i==0){
                stack1.push(temperatures[i]);
                continue;
            }
            if(temperatures[i]>temperatures[position]){
                stack1.push(temperatures[i]);
                output[position] = counter;
                position++;
                for(int x = 0; x<counter-1; x++){
                    stack1.pop();
                }
                counter = 1;
                i=position;
                continue;
            } else{
                stack1.push(temperatures[i]);
                counter = counter + 1;
            }
        }
        return output;
    }
}
