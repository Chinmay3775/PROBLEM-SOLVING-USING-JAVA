class Solution {
    public String[] findWords(String[] words) {
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        
        List<String> list = new ArrayList<>();
        for(String word:words){
            String lowerWord=word.toLowerCase();
                if(isOneRow(lowerWord,str1)||isOneRow(lowerWord,str2)||isOneRow(lowerWord,str3)){
                    list.add(word);
                }
            }
        return list.toArray(new String[0]);
    }
    private boolean isOneRow(String word,String row){
        for(char c:word.toCharArray()){
            if(row.indexOf(c)==-1) return false;
        }
        return true;
    }
}
/*

We create three strings representing each row of the keyboard.

We initialize an ArrayList to store the valid words.

We loop through each word in the input array.

We convert each word to lowercase to make the check case-insensitive.

We check if all characters of the word are found in only one keyboard row.

If the word passes the check, we add the original word to the result list.

Finally, we return the result list as an array.

*/
