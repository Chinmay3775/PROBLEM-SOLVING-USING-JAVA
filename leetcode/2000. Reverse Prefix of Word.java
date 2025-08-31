class Solution {
    public String reversePrefix(String word, char ch) {
        int idx= word.indexOf(ch);
        int i=0;
        char[] arr = word.toCharArray();
        while(i<idx){
            char temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            i++;
            idx--;
        }
        return new String(arr);
    }
}
