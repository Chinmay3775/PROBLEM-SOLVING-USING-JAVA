class Solution {
    public int maxScore(String s) {
        int leftZeros = 0;
        int rightOnes = 0;

        // Count the total number of ones in the string initially
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }

        int maxScore = 0;

        // Iterate through the string up to the second-last character
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++; // Increment zeros in the left substring
            } else {
                rightOnes--; // Decrement ones in the right substring
            }

            // Calculate and update the maximum score
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
}
