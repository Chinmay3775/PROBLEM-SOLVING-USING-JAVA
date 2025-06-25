class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        for (int i : nums) {

            if (i == max || i == second_max || i == third_max) {
                continue;
            }
            if (i > max) {
                third_max = second_max;
                second_max = max;
                max = i;
            } else if (i > second_max) {
                third_max = second_max;
                second_max = i;
            } else if (i > third_max) {
                third_max = i;
            }
        }
        if (third_max == Long.MIN_VALUE || 
            max == second_max || second_max == third_max) {
            return (int)max;
        }
        return (int)third_max;
    }
}
