class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        int n = arr.length;
        if (n == 0) return null; // Edge case: if the array is empty

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return as Pair with Long values
        return new Pair<>((long) min, (long) max);
    }
}
