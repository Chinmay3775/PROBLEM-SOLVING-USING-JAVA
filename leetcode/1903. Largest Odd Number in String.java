class Solution {
    public String largestOddNumber(String num) {
        String rev="";
        for(int i=num.length()-1;i>=0;i--){
            int n=num.charAt(i);
            if(n%2!=0){
                rev=num.substring(0,i+1);
                break;
            }
        }
        return rev;
    }
}
// Traverse the array from the end and if any digit is found to be odd return string from first to the index where odd number is found in the string and return the string
