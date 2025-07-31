class Solution {
    public int hammingDistance(int x, int y) {
        int result=x^y;
        int count=0;
        while(result>0){
            count+=result&1;
            result=result>>1;
        }
        return count;
    }
}

/*
To check the distance between the two differing bits of two numbers first we'll take the XOR of it so that we get the differing bits as 1's in another variable;
next we check if the bit is 1 or not by anding it with 1 is yes then count++ else 0
and the shift the bit to right once done this will be done till the number is 0 so will get the value;
*/
