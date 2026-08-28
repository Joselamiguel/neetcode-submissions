class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        
        int[] characters = new int[26];
        int[] characters2 = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i = 0; i<s1.length(); i++){
            int j = s1.charAt(i) - 'a';
            characters[j]++;
            int k = s2.charAt(i) - 'a';
            characters2[k]++;
        }
        int matches = 0;
        for(int i = 0; i<26; i++){
            if(characters[i]==characters2[i]){
                matches++;
            }
        }
        for(int r = s1.length(); r<s2.length(); r++ ){
            if(matches == 26){
            return true;
            }
            int index = s2.charAt(r) - 'a';
            characters2[index]++;
            if(characters2[index] == characters[index]){
                matches++;
            } else if(characters[index]+1 == characters2[index]){
                matches--;
            }
            index = s2.charAt(l) - 'a';
            characters2[index]--;
            if(characters2[index] == characters[index]){
                matches++;
            } else if(characters[index]-1 == characters2[index]){
                matches--;
            }
            l++;
        }
        return matches==26;

    }
}
