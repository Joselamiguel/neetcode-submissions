

class Solution {
    public boolean hasDuplicate(int[] nums) {
    
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i: nums){
            if(table.get(i)!=null){
                return true;
            }
            table.put(i,i);
            
        }
        return false;
    
    }
}