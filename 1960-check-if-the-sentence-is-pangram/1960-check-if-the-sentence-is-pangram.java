class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        for(char ch = 'a'; ch <= 'z'; ch++ ){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}

// String s = "hello";
// s.indexOf('h');  // returns 0  (found at index 0)
// s.indexOf('e');  // returns 1  (found at index 1)
// s.indexOf('z');  // returns -1 (not found)
