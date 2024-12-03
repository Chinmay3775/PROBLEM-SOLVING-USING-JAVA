class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        for (int i = 0; i < arr.length; i++) {
            int original = arr[i]; 
            int reverse = 0;
            int num = arr[i]; 

            // Reverse the number
            while (num != 0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }

            if (original != reverse) {
                return false;
            }
        }

        return true; 
    }
}
