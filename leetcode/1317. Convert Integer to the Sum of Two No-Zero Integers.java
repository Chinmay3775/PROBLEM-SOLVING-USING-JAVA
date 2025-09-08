class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=0,b=0;
        for(int i=1;i<n;i++){
            a=i;
            b=n-i;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0") ){
            return new int[] {a,b};
            }
        }
        return new int[0];
    }
}
