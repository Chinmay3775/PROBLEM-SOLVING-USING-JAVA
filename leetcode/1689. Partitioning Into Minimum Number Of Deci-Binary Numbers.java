class Solution {
    public int minPartitions(String n) {
        int max=-1;
        for(char c:n.toCharArray()){
            int digit= c-'0';
            if(digit>max) max= digit;
        }
        return max;
    }
}
