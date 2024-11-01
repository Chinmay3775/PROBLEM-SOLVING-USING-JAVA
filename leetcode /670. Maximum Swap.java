class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a character array of digits
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;
        
        // Create an array to store the last occurrence index of each digit
        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[digits[i] - '0'] = i;
        }
        
        // Traverse the digits and try to swap with a larger digit found later
        for (int i = 0; i < n; i++) {
            // Check if there's any larger digit after the current digit
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;
                    
                    // Return the result as an integer
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        
        // If no swap can maximize the number, return the original number
        return num;
    }
}
