class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = piles[0];
       for(int i = 1; i<piles.length; i++){
        if(max<=piles[i]){
            max = piles[i];
        }
       }
       int pile = h/piles.length;
       int outputMax = (max/pile)+1;
       int min = 1;
       int sum =0;
       int currentMin = 0;
       while(min<=outputMax){
        int mid = (outputMax+min)/2;
        for(int j = 0; j<piles.length; j++){
            if(((double)piles[j]/mid)% 1 == 0){
                sum+=piles[j]/mid;
            }
            else if(piles[j]/mid <1){
                sum+=1;
            }else{
                sum+= (piles[j]/mid)+1;
            }
        }
        if(sum>h){
            min=mid+1;
            sum = 0;
        }else{
            currentMin = mid;
            sum = 0;
            outputMax = mid-1;
        }
       }
       return currentMin;
       
       

    }
}
