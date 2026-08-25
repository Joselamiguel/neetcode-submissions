class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> characters = new Hashtable<>();
        int l = 0;

        int maxlength = 0;
        int oldL = 0;
        char[] chars = s.toCharArray();

        if(chars.length <= 1){
            return chars.length;
        }
        characters.put(chars[l], 0);
        for(int r = 1; r<chars.length; r++){
            if(characters.containsKey(chars[r])){
                maxlength = Math.max(maxlength, r-l);
                oldL = l;
                l = characters.get(chars[r])+1;
                for(int i = oldL; i<l-1; i++){
                    characters.remove(chars[i]);
                }
                characters.replace(chars[r],r);
                
            } else{
                characters.put(chars[r], r);
            }
        }
        maxlength = Math.max(maxlength, chars.length-l);
        return maxlength;
    }

}
