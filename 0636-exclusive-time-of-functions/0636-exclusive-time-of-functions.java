class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int funcId = Integer.parseInt(parts[0]);
            String action = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (action.equals("start")) {
                // If someone was already running, add the time until now
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timestamp - prevTime;
                }
                // Now the new function starts running
                stack.push(funcId);
                prevTime = timestamp;
            } else {
                // Ending the function on top of the stack
                result[stack.pop()] += timestamp - prevTime + 1;
                // Move to the next time unit after ending
                prevTime = timestamp + 1;
            }
        }

        return result;
    }
}
