class Solution {
    public int countHillValley(int[] nums) {
        int countHills=0;
        for(int i=1;i<nums.length-1;i++){
            int prev=i-1;
            int next=i+1;

            if(nums[i]==nums[i-1]) continue; // to skip duplicates

            while(prev>=0 && nums[prev]==nums[i]){  // to move to recent or closest duplicate value from left
                prev--;
            }
            while(next<nums.length && nums[next]==nums[i]){ //// to move to recent or closest duplicate value from right
                next++;
            }
            if(prev>=0 && next<nums.length){
                if((nums[prev]<nums[i] && nums[i]> nums[next] )||( // to check if the value is hill or valley 
                    nums[i]<nums[prev] && nums[i]< nums[next])){
                        countHills++;
                    }
                
                }
        }
        return countHills;
          
    }
}
// the logic is easy as consider 3 point and if middle one is greater than the both its a hill is all are same its a plane or is middle one is smallest then the eithers then its a valley
