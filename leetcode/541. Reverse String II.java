class Solution {
    public String reverseStr(String s, int k) {
        int len=s.length();
        char[] arr =s.toCharArray();
        for(int i=0;i<len;i+=2*k){
            int start=i;
            int end = Math.min(i + k - 1, len - 1);
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
