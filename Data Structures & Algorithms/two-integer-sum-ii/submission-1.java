class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int end = numbers.length -1;
        int start = 0;
        int[] output = new int[2];
        for(int i =0 ; i<numbers.length; i++){
                if(numbers[start] + numbers[end] == target){
                    output[0] = start+1;
                    output[1] = end+1;
                    break;
                }else if(numbers[start]+ numbers[end] > target){
                    end-=1;
                }
                else{
                    start+=1;
                    end = numbers.length - 1;
                    i=0;
                }
        }
        return output;

    }
}
