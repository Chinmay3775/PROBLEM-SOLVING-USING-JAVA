class Solution {
    public int maximumCount(int[] nums) {
        int neg_count=0;
        int pos_count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>0) pos_count++;
            else if(nums[i]<0) neg_count++;
        }
        return Math.max(neg_count,pos_count);
    }
}
