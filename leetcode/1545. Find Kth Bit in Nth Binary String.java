public class Solution {
    public char findKthBit(int n, int k) {
        int length = (1 << n) - 1;
        int mid = (length / 2) + 1;
        
        if (n == 1) {
            return '0';
        } else if (k == mid) {
            return '1';
        } else if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            return invert(findKthBit(n - 1, length - k + 1));
        }
    }
    
    private char invert(char bit) {
        return bit == '0' ? '1' : '0';
    }

}
