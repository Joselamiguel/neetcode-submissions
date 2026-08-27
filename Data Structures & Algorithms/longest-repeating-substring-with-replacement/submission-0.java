class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        char[] characters = s.toCharArray();
        Hashtable<Character,Integer> c = new Hashtable<>();
        int maxf = 0;
        
        int output = 0;
        for(int r = 0; r<characters.length; r++){
            int frequency = c.getOrDefault(characters[r], 0);
            c.put(characters[r], frequency+1);
            maxf = Math.max(c.get(characters[r]), maxf);
            while(((r-l+1)-maxf)>k){
                c.put(characters[l],c.get(characters[l])-1);
                l++;
            }
            output = Math.max(output, r-l+1);
        }
        return output;
    }
}
