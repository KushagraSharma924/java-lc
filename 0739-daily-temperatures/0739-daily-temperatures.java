class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        
        
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            
            
            while (!stack.isEmpty() && stack.peek()[0] < currentTemp) {
                int[] prev = stack.pop();
                int prevIdx = prev[1];
              
              
                
                
                result[prevIdx] = i - prevIdx;
               
            }
             stack.push(new int[]{currentTemp, i});
            
        }    
        return result;

    }
}