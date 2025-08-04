class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int len=num.length-1;
        int carry=0;
        while(len>=0 || k>0 || carry>0) 
        {
            int temp=carry;
            if(len>=0) temp+=num[len--];
            if(k>0)
            {
                temp+=k%10;
                k/=10;
            }
            list.add(temp%10);
            carry=temp/10;
                
        }
        Collections.reverse(list);
        return list;
    }
}
