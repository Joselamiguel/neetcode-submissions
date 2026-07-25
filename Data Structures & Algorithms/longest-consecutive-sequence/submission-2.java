class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> listNumber = new HashMap<>();
        int[] maxcounter = new int[nums.length];
        int counter =  1;
        for(Integer num : nums){
            if(listNumber.containsKey(num)){
                int freq = listNumber.get(num);
                listNumber.put(num, freq+1);
            }
            else{
                listNumber.put(num, 1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums.length==0){
                break;
            }
            if(i==nums.length-1){
                 maxcounter[i] = counter;
                 break;
            }
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(listNumber.containsKey(nums[i]+1)){
                counter+=1;
                continue;
            }else{
                maxcounter[i] = counter;
                counter = 1;
                continue;
            }
        }
        Arrays.sort(maxcounter);
        if(nums.length==0){
                return 0;
            }
        int max = maxcounter[nums.length-1];
        return max;

    }
}
