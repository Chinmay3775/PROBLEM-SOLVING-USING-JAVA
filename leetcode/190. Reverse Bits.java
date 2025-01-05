public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int num=0;
        for(int i=0;i<32;i++){
            int r=n & 1;
            num|=(r<<(31-i));
            n>>>=1;
        }
        return num;
    }
}
