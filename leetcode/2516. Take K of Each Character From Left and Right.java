class Solution {
    public int takeCharacters(String s, int k) {
        if (k == 0) return 0; // No characters required, return 0

        int n = s.length();
        int[] totalCount = new int[3]; // Total counts of 'a', 'b', 'c'

        // Count occurrences of each character in the string
        for (char ch : s.toCharArray()) {
            totalCount[ch - 'a']++;
        }

        // Check if it is possible to take k of each character
        for (int count : totalCount) {
            if (count < k) return -1; // Not enough characters
        }

        // Sliding window to find the largest valid substring
        int left = 0, maxValidSubstringLength = 0;
        int[] windowCount = new int[3]; // Counts of characters in the current window

        for (int right = 0; right < n; right++) {
            windowCount[s.charAt(right) - 'a']++;

            // Shrink the window if it becomes invalid
            while (windowCount[0] > totalCount[0] - k ||
                   windowCount[1] > totalCount[1] - k ||
                   windowCount[2] > totalCount[2] - k) {
                windowCount[s.charAt(left) - 'a']--;
                left++;
            }

            // Update the maximum valid substring length
            maxValidSubstringLength = Math.max(maxValidSubstringLength, right - left + 1);
        }

        // Minimum steps = Total length - Maximum valid substring length
        return n - maxValidSubstringLength;
    }
}
