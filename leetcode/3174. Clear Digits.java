class Solution {
    public String clearDigits(String s) {
        char[] arr = new char[s.length()];
        int top=-1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(top>=0) top--;
            }
            else{
                arr[++top]=c;
            }
        }
        return new String(arr,0,top+1);
    }
}
