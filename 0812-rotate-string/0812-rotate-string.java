class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String s3 = s + s;
        
        for(int i=0; i<s3.length(); i++){
            if(s3.contains(goal)){
                return true;
            }
        }
        return false;
    }
}