class Solution {
    public int findComplement(int num) {
    int l=Integer.toBinaryString(num).length();
    int n=(1<<l)-1;
    return num^n;
    }
}
