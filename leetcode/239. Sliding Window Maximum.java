class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int len= nums.length;
        // if (len == 0 || k == 0) return new int[0];
        // int[] result= new int[len-k+1];
        // for(int i=0;i<=len-k;i++){
        //     int max=nums[i];
        //     for(int j=i;j<i+k;j++){
        //         max=Math.max(max,nums[j]);
        //     }
        //     result[i]=max;
        // }
        // return result;
        
        int len= nums.length;
        int[] result = new int[len - k + 1];
        int idx = 0;


        Deque<Integer> dq= new ArrayDeque<>();
         
        for(int i=0;i<len;i++){
            if(!dq.isEmpty() && dq.getFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            if(i>=k-1){
                result[idx++]=nums[dq.getFirst()];
            }
        }
        return result;
    }
}
