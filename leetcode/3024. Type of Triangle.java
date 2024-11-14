class Solution {
    public String triangleType(int[] nums) {
        // Check if all three sides are equal
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        
        // Check if the three sides can form a triangle (triangle inequality)
        if (nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1]) {
            // Check if any two sides are equal
            if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "none";
        }
    }
}
