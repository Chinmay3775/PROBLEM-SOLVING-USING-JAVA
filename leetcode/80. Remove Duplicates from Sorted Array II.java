class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2||n!=nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;   
    }
}

/*
We use i = 0 to track where to place the next valid number.
The for loop checks each number n in the array.
The if condition allows:
  The first two numbers (i < 2)
  Or if n is not the same as the number two steps before (n != nums[i - 2])
If allowed, we put n at position i and increase i.
At the end, i is the length of the array with max 2 duplicates of any number.
*/
