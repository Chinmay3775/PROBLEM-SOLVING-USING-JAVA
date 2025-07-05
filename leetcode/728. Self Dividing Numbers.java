class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList();

        for(int i=left ;i<=right;i++){
            if(valid(i)) output.add(i);
        }
        return output;
    }
    public boolean valid(int num){
        int temp=num;
        while(num!=0){
            int digit=num%10;
            if(0==digit||0!=temp%digit){
                return false;
            }
            num/=10;
        }
        return true;
    }
}
