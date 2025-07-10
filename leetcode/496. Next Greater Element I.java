class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i= 0 ;i<nums1.length;i++){
            int Index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    Index=j;
                    break;
                }
            }
                int nextGreater=-1;
            for(int j=Index+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    nextGreater=nums2[j];
                    break;
                }
            
                }
                arr[i]=nextGreater;
            }
        
        return arr;
    }
}
