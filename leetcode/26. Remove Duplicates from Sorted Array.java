class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[count-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
