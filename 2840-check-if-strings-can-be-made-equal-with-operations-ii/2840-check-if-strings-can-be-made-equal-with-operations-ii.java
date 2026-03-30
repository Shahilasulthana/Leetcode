class Solution {
    public boolean checkStrings(String s1, String s2) {
        // (j-i) % 2 == 0 => indirectly says that the odd place elements only swap with the odd placed elements and like wise the even placed elements will only swap with the even placed elements
        // so just check the frequency of odd and even characters in both the strings
        // if they have similar elements then return true, else false
        
        int[] even1 = new int[26];
        int[] odd1 = new int[26];
        int[] even2 = new int[26];
        int[] odd2 = new int[26];

        for(int i=0; i<s1.length(); i++){
            if(i % 2 == 0){
                even1[s1.charAt(i) - 'a']++;
                even2[s2.charAt(i) - 'a']++;
            } else{
                odd1[s1.charAt(i) - 'a']++;
                odd2[s2.charAt(i) - 'a']++;
            }        
        }
        for(int i=0; i<26; i++){
            if(even1[i] != even2[i] || odd1[i] != odd2[i]){
                return false;
            }
        }
    return true;
    }
}