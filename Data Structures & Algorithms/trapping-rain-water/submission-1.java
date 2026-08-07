class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;
        int i = 0;
        while(left<=right){
            if(maxLeft>maxRight){
                int sum = maxRight-height[right];
                if(sum<0){
                    maxRight = height[right];
                }else{
                    water+=sum;
                }
                right--;
            }else {
                int sum = maxLeft-height[left];
                if(sum<0){
                    maxLeft = height[left];
                }else{
                    water+=sum;
                }
                left++;
            }
        }
        return water;
        
    }
}
