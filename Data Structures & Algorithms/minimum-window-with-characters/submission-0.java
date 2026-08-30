class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        int[] freq2 = new int[128];
        int[] res = new int[2];
        int reslen = Integer.MAX_VALUE;
        int l = 0;
        int need = 0;
        int have = 0;
        if(s.length()<t.length()){
            return "";
        }
        for(int i = 0; i<t.length(); i++){
            freq2[t.charAt(i)]++;
        }
        for(int i : freq2){
            if(i>0){
                need++;
            }
        }
        for(int r = 0; r<s.length(); r++){

            freq[s.charAt(r)]++;
            if(freq[s.charAt(r)] == freq2[s.charAt(r)]){
                have++;
            }
            while(have == need){
                if ((r - l + 1) < reslen) {
                    reslen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                if(freq[s.charAt(l)] == freq2[s.charAt(l)]){
                    have--;
                } 
                freq[s.charAt(l)]--;
                l++;
            }
        }
        
        return reslen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
