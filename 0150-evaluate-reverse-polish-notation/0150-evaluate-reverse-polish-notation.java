class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = st.pop();
                int a = st.pop();

                int result = 0;

                switch(token){
                    case "+" : result = a + b; break;
                    case "-" : result = a - b; break;
                    case "*" : result = a * b; break;
                    case "/" : result = a / b; break;
                }
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}