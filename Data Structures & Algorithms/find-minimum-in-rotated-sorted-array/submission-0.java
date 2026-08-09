class Solution {
    public int findMin(int[] nums) {
        int min = 0;
        int max = nums.length-1;
        int currentMin = nums[0];
        int mid = 0;
        while(min<=max){
            mid = (min+max)/2;
            if(nums[mid]<currentMin){
                currentMin = nums[mid];
                max = mid - 1;
            }else{
                min = mid +1;
            }
        }
        return currentMin;
    }
}
