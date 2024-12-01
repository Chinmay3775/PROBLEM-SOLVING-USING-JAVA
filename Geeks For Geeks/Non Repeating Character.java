class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        char[] arr = s.toCharArray();  // Convert string to character array
        int[] freq = new int[26];  // Frequency array for characters
        
        // Count the frequency of each character
        for (char c : arr) {
            freq[c - 'a']++;
        }
        
        // Find and return the first non-repeating character
        for (char c : arr) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        
        }
        return '$';
        
    }
}
