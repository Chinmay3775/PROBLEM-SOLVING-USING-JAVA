class Solution {
    public int countValidSelections(int[] nums) {
        int n= nums.length;
        int left=0;
        int right=0;
        int index=0;
        for(int i=0;i<n;i++){
            left = left+nums[i];
            if(nums[i]==0){
                index=i;
                break;
            }
        }
        for(int i=index;i<n;i++)
        right=right+nums[i];
         
         int cnt=0;
         for(int i=index;i<n;i++){
            left+=nums[i];
            right-=nums[i];
            if (nums[i] != 0) continue;
            
            if (left == right) cnt += 2;
            else if (left - 1 == right || left + 1 == right) cnt += 1;
        }
        return cnt;

        }
    
}
