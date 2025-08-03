import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger n1 =new BigInteger(a,2); 
       BigInteger n2 =new BigInteger(b,2);
       BigInteger sum=n1.add(n2);
       return sum.toString(2);
       
    }
}
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||carry==1){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }
}
