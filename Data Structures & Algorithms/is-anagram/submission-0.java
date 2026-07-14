class Solution {
    public boolean isAnagram(String s, String t) {
        char[] characterS = s.toCharArray();
        char[] characterT = t.toCharArray();
        HashMap<Character, Integer> table = new HashMap<>();
        if(characterS.length != characterT.length){
            return false;
        }
        for(Character i: characterS){
            if(table.get(i)!=null){
                Integer counter = table.get(i);
                table.put(i, counter+=1);
            }else{
                table.put(i, 1);
            }
        
        }

        for(Character j: characterT){
            if(table.get(j)==null){
                return false;
            }
            if(table.get(j)!=0){
                Integer counter = table.get(j);
                table.put(j, counter-=1);
            } else{
                return false;
            }
        }
        return true;
    }
}
