class Solution {
    public String replaceDigits(String s) {
        char[] arr=s.toCharArray();
        for(int i=1;i<s.length();i=i+2){
            int c= arr[i]-'0';
            arr[i]=(char)(arr[i-1]+c);
        }
        return new String(arr);
    }
}

//Convert the string into char array
//then run the loop by starting from index 1 and then iterator bu incrementing by 2 
// store the number value in int 
// Increment then digit with the value in int 
//convert the array to new string and return it
