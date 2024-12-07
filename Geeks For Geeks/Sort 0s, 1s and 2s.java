class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
 
        int low = 0, mid = 0, high = arr.length - 1;

        // Traverse the array
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid], move both pointers forward
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // Move mid forward for 1
                mid++;
            } else {
                // Swap arr[mid] and arr[high], move high backward
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
