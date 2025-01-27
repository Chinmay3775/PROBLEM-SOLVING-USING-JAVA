class Solution {
    public boolean isThree(int n) {
        int i=2;
        int cnt=2;
        while(i<n){
            if(n%i==0) {
                cnt++;
            }
            i++;
        }
        return cnt==3;
    }
}
