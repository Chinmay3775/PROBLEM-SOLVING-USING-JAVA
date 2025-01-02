class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlesum=0;
        int doublesum=0;


        for(int n:nums){
            if(n<10) {
                singlesum+=n;
            }
            else if(n>=10&& n<100){ 
                doublesum+=n;
            }
        }
    return singlesum>doublesum|| doublesum>singlesum;
    }
}
