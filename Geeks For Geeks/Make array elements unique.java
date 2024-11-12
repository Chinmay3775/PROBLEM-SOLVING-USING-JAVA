class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Set<Integer> st =new HashSet<>();
        Arrays.sort(arr);
        int sum=0;
        int max=0;
        
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if (st.contains(arr[i])){
                max++;
                sum+=max-arr[i];
                st.add(max);
            }
            else{
                st.add(arr[i]);
            }
        }
        return sum;
    }
}
