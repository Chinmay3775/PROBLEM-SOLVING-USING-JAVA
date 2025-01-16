class Solution {
    public String convertToBase7(int num) {
        // if(num==0) return "0";
        // boolean isNeg=num<0;
        // num=Math.abs(num);
        // String result="";
        // while(num>0){
        //     result=(num%7)+result;
        //     num/=7;

        // }
        // if (isNeg) result="-" + result;
        // return result;
     
        return Integer.toString(num , 7);
    }
}
