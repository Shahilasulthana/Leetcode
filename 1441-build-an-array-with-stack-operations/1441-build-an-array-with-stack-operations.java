class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> res = new ArrayList<>();
        int current = 1;

        for(int t : target){
            while(current < t){
                res.add("Push");
                res.add("Pop");
                current ++;
            }
            res.add("Push");
            current ++;
        }
        return res;

    }
}

//BREAKDOWN OF THE PROBLEM

// 1. Current is like the tracer who will trace whether the number in the target is smaller than the current number or not

// 2. IF  it is less then add the push and pop both in the result ELSE only add Push in the result

// 3. Return the res