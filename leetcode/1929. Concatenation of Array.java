class Solution {
    public int[] getConcatenation(int[] nums) {
        // int len1=nums.length;
        // int len2=2*len1;
        // len1=len1-1;
        // int[] arr = new int[len2];

        // for (int i=arr.length-1;i>=0;i--){
        //     if(len1<0) {
        //         len1=nums.length-1;
        //         i+=1;
        //     }
        //     else{
        //         arr[i]=nums[len1];
        //         len1-=1;
        //     } 
        // }
        //     return arr;

        int len1=nums.length;
        int[] arr = new int[2*len1];

        System.arraycopy(nums,0,arr,0,len1);
        System.arraycopy(nums,0,arr,len1,len1);        

        return arr;
    }
}
