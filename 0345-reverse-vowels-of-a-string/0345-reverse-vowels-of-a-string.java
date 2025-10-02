class Solution {
    public String reverseVowels(String s) {
        // convert the string into array of characters

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            while(i < j && !isVowel(arr[i])){
                i++;
            }
            while(i < j && !isVowel(arr[j])){
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU". indexOf(c) != -1;
    }
}


// we can have two pointers i and j
// i moves from starting and j moves from end
// whenever both i and j are vowels just exchange them and increase i and decrease the j
// when any one is vowel and other is not just increase or decrease the pointer where no vowel appears until it points to the vowel
