class Solution {
    public boolean isAnagram(String s, String t) {
       //convert the string into array of characters
       char[] str1 = s.toCharArray();
       char[] str2 = t.toCharArray();

       Arrays.sort(str1);
       Arrays.sort(str2);

       if(Arrays.equals(str1, str2)){
        return true;
       } 
       return false;
    }
}