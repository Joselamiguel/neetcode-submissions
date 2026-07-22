class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixsum = new int[nums.length];
        int[] suffixsum = new int[nums.length];
        int[] output = new int[nums.length];
    
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefixsum[0] = 1;
                continue;
            }
            prefixsum[i] = prefixsum[i-1]*nums[i-1];
              
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                suffixsum[j] = 1;
                continue;
            }
            suffixsum[j] = nums[j+1] * suffixsum[j+1];
        }
        for(int z=0;z<nums.length;z++){
            output[z] = prefixsum[z]*suffixsum[z];
        }
        return output;
    }
}  
