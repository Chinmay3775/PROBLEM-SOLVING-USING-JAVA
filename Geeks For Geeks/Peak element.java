class Solution {

    public int peakElement(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid element with its right neighbor
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // Peak is in the right half
            } else {
                right = mid; // Peak is in the left half
            }
        }

        // 'left' and 'right' converge to the peak index
        return left;
    }
}

    
