class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();

        int counter = 0;
        int[] output = {0,0};
        while(counter<nums.length){
            int target2 = target - nums[counter];
            if(table.get(target2)!=null){
            output[0] = table.get(target2);
            output[1] = counter;
            break;
            } else {
            table.put(nums[counter], counter);
            counter++;
            }
        }
        return output;
    
        
    }
}
