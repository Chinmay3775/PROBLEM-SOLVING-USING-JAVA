class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int len=nums.length;
        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //     if((nums[i]==nums[j]) && Math.abs(i-j)<=k)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //NOT OPTIMIZED METHOD

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
