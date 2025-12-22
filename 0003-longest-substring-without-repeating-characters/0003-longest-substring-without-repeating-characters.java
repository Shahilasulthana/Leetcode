class Solution {
    public int lengthOfLongestSubstring(String s) {
        // crete a set to keep track of the duplicates
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0 , right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxLen = Math.max(maxLen, right-left+1);
                right ++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}