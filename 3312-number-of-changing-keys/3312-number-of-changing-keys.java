class Solution {
    public int countKeyChanges(String s) {
        String check = s.toLowerCase();
        int count = 0;
        for(int i=0; i<check.length()-1;i++){
            if(check.charAt(i) != check.charAt(i+1)){
                count ++;
            }
        }
        return count;
    }
}