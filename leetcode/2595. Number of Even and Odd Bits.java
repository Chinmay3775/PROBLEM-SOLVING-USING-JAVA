class Solution {
    public int[] evenOddBit(int n) {
        String binary= new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        int even=0;
        int odd=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1') 
            if(i%2==0)even++;
            else odd++;
        }
       
        int[] arr={even,odd};
        return arr;
    }
}
