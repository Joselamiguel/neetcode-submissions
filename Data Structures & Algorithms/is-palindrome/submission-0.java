class Solution {
    public boolean isPalindrome(String s) {
        char[] stringList = s.replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        int end = stringList.length - 1;
        int start = 0;
        for(char chars : stringList){
            if(start>=end){
                break;
            }
            if(Character.toLowerCase(stringList[end]) == Character.toLowerCase(stringList[start])){
                start+=1;
                end-=1;
                continue;
            }else {
                return false;
            }
        }
        return true;

    }
}