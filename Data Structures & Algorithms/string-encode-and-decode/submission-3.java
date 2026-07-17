class Solution {

    public String encode(List<String> strs) {
       
        if (strs.isEmpty()) return "EMPTY_LIST";
        
        return String.join("😊", strs);
    }

    public List<String> decode(String str) {
     
        if (str.equals("EMPTY_LIST")) return new ArrayList<>();
        
        return Arrays.asList(str.split("😊", -1));
    }
}