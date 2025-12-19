class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);// sort the string array

        String first = v[0]; // start pointer

        String last = v[v.length-1]; // end pointer

        for (int i=0; i<Math.min(first.length(), last.length()); i++) { //choosing the smallest string, however the common prefix will appear to the length of smallest string
            if (first.charAt(i) != last.charAt(i)) {
                
                return ans.toString(); // do nothing just return
            }
            ans.append(first.charAt(i)); //add to the result
        }
        return ans.toString();
    }
}