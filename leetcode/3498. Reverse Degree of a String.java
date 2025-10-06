class Solution {
    public int reverseDegree(String s) {
        int len= s.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int c=s.charAt(i)-'a'+1;
            sum+=(27-c)*(i+1);
        }
        return sum;
    }
}
