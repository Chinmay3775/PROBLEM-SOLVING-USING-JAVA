
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                
                nonZeroIndex++;
            }
        }
    }
}
