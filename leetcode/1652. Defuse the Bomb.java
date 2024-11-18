class Solution {
    public int[] decrypt(int[] code, int k) {
               int n = code.length;
        int[] decrypted = new int[n];
        
        if (k == 0) {
            Arrays.fill(decrypted, 0);
            return decrypted;
        }

        int sum = 0;
        int start = k > 0 ? 1 : n + k;  // Starting index for the first sum
        int end = k > 0 ? k : n - 1;    // Ending index for the first sum

        // Compute the initial window sum
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        // Compute results for each index
        for (int i = 0; i < n; i++) {
            decrypted[i] = sum;

            // Update the sliding window
            sum -= code[start % n];
            sum += code[(end + 1) % n];
            start++;
            end++;
        }
        
        return decrypted;
    }
}
