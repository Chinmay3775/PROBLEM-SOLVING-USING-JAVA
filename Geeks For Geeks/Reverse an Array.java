class Solution {
    public void reverseArray(int arr[]) {
        // code here
     int left = 0, right = arr.length - 1;

        // Reverse the array in-place
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
