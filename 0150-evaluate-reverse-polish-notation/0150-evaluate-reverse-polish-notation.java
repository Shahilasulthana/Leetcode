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

// Reversed Polish Notation is a mathematical expression to express numbers without brackets
// We use a stack to solve the RPN equations
// What we do is :
// If (number) => push 
// If (operator) => pop 2 top numbers => result => push the result into the stack again
// return the result