class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize the smallest positive number to find
        int smallestMissing = 1;

        // Step 3: Iterate through the array
        for (int num : arr) {
            // Skip negative numbers and duplicates
            if (num == smallestMissing) {
                smallestMissing++;
            }
        }

        // Step 4: Return the smallest missing positive number
        return smallestMissing;
    }
}
