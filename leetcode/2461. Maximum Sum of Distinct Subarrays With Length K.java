import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currentSum = 0;
        HashSet<Integer> uniqueElements = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Slide the window
            while (uniqueElements.contains(nums[right])) {
                currentSum -= nums[left];
                uniqueElements.remove(nums[left]);
                left++;
            }

            // Add the current number to the window
            uniqueElements.add(nums[right]);
            currentSum += nums[right];

            // If the window size is exactly k, check the sum
            if (uniqueElements.size() == k) {
                maxSum = Math.max(maxSum, currentSum);

                // Shrink the window from the left
                currentSum -= nums[left];
                uniqueElements.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}
