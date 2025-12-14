class Solution {
    public boolean isPalindrome(int x) {
        // reverse and check it
        String s = Integer.toString(x);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
        
    }
}