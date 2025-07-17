class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch : letters){
            if(ch>target)
                return ch;
        }
        return letters[0];
    }
}

// We need to return the value which is greater than targeted but smaller in the array
