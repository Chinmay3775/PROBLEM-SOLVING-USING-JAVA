class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       for(int n : nums){
           int numDigits = (int) Math.log10(n) + 1;
           if (numDigits % 2 == 0)
               count++;
       }
       return count;
    }
}
