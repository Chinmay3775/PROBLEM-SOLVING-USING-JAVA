class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i: nums){
            if(count==0) {
                candidate=i;
                count++;
            }else if(i==candidate) count++;
            else count--;
        }
         count = 0;
        for (int i : nums) {
            if (i == candidate) {
                count++;
            }
        }
         if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
    }
