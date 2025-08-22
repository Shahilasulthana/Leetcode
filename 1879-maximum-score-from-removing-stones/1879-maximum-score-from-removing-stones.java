class Solution {
    public int maximumScore(int a, int b, int c) {
        int score = 0;
         while((a != 0 && b != 0) || (b != 0 && c != 0) || (a != 0 && c != 0)){
            // for a is greater than all other
            if( (a >= b) && (a >= c)){
                a--;
            if(b >= c){
                b--;
            }else{
                c--;
            }
            }

            // for b is greater
            else if( (b >= c) && (b >= a)){
                b--;
            if(a >= c){
                a--;
            }else{
                c--;
            }
            }

            // for c is greater
            else{
                c--;
            if(a >= b){
                a--;
            }else{
                b--;
            }
            }
            score ++;
         }
         return score;
    }
}

// Approach:

// First reduce the one which has higher no.of.stones in it, if not move to the next one
// continue the process until we end up getting all piles as empty piles