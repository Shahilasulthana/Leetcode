class Solution {
    public int calPoints(String[] operations) {
        // we can use a stack here 
        int score = 0;
        Stack<Integer> st = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
            }
            else if(op.equals("D")){
                st.push(2 * st.peek());
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        for(int num : st){
            score += num;
        }
        return score;

    }
}