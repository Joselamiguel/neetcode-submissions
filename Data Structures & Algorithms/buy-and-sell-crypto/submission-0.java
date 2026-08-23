class Solution {
    public int maxProfit(int[] prices) {
        int curr = prices[0];
        int space = 0;
        int max = 0;
        for(int i = 1; i<prices.length; i++){
            if(curr>prices[i]){
                curr = prices[i];
            } else{
                space = prices[i]-curr;
                if(space>max){
                    max = space;
                }
            }
        }
        return max;
    }
}
