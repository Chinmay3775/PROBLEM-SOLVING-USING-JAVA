class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s= new Stack<>();
        int len=temperatures.length;
        int arr[]= new int[len];
        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[i]>=temperatures[s.peek()])
            {
                s.pop();
            }
            arr[i]=(s.isEmpty())? 0:s.peek()-i ;
            s.push(i);
        }
        return arr;
    }
}      
