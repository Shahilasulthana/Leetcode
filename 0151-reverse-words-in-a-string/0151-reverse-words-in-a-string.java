class Solution {
    public String reverseWords(String s) {
        // convert the string into array of characters
        String[] str = s.trim().split("\\s+");

        // to store the reversed string
        StringBuilder result = new StringBuilder();

        // traverse
        for(int i=str.length - 1; i>=0; i--){
            result.append(str[i]);
            if( i > 0) result.append(" ");
        }
        return result.toString();
    }
}