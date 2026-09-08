class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        for(int i =0; i<nums.length; i++){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                int ptr1 = 0;
                int ptr2 = slow;
                while(ptr1!=ptr2){
                    ptr1 = nums[ptr1];
                    ptr2 = nums[ptr2];
                }
                return ptr1;
            }

            

        }
        return -1;
    }
}
