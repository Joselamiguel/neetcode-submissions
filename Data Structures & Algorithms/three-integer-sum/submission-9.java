class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int[] threeSub = new int[3];
        int end = nums.length -1;
        int target = 0;
        int start = 0;
        int j = end - 1;
        List<List<Integer>> list = new ArrayList<>();
        while(true){
            if(start>=j){
                end-=1;
                j=end-1;
                
            }
            if(start>=end){
                if(start+1>=nums.length){
                    break;
                }
                start+=1;
                end = nums.length-1;
                j = end-1;
            }
            if(nums[start]>0){
                break;
            }
            target = nums[start] * -1;
            if(nums[end]+nums[j] == target){
                List<Integer> triplet = List.of(nums[start], nums[j], nums[end]);
                if (!list.contains(triplet)) {
                    list.add(triplet);
                }
                end-=1;
                j = end -1;
                
            }else{
                target-=nums[end];
                if(target>nums[j]){
                    end-=1;
                    j=end-1;
                    
                } else if(target<nums[start]){
                    end-=1;
                    j=end-1;
                }
                 else{
                    j-=1;
                }
            }
        }
        return list;
    }
}
