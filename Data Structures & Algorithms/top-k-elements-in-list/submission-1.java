class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> table = new HashMap<>();
        int[] outputs = new int[k];
        Integer[] values = new Integer[nums.length];
        int counter = -1;
        int number = 0;
        int x = 0;
        int maxlocation = 0;
        for(int num : nums){
            if(table.containsKey(num)){
                x = table.get(num) + 1;
                table.put(num, x);
            } else{
                x = 1;
                table.put(num, x);
                counter++;
                values[counter] = num;
            }
        }
        x=0;
        counter = 0;
        while(x<k){
            int max = table.get(values[x]);
            maxlocation = values[x];
            for(Integer num : values){
                if(num==null){
                    break;
                }
                number = table.get(num);
                if(number>max){
                    max = table.get(num);
                    maxlocation = num;
                }
            }
            outputs[x] = maxlocation;
            table.put(maxlocation, -1);
            x++;
        }

        return outputs;


        
    }
}
