class Solution {
   
    public char findTheDifference(String s, String t) {
        char extraletter = 0;
        for(char c:s.toCharArray()) extraletter ^= c;
        for(char c:t.toCharArray()) extraletter ^= c;
        return extraletter;
        
    }
}