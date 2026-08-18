class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target == nums[min]){
                return min;
            }

            if(nums[mid]<nums[min]){
                if(target<nums[mid] || target>nums[min]){
                    max = mid -1;
                }
                else{
                    min = mid +1;
                }
            }
            else{
                if(target<nums[mid] && target>nums[min]){
                    max = mid-1;
                }else{
                    min = mid +1;
                }
            }
            
        }
        return -1;
    }
}
