class Solution {
    public int mostWordsFound(String[] sentences) {
        // Initialize to store the max no.of.words
        int max_words = 0;

        // Traverse the sentences array using for-each loop
        for(String str : sentences){
            String[] splitted = str.split(" ");
            max_words = Math.max(max_words, splitted.length);
        }
        return max_words;
    }
}