class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            str.append((char)('A'+columnNumber%26));
            columnNumber= columnNumber/26;
        }
        return str.reverse().toString();
    }
}

/*
Any while loop we check if the number is greater than 0 if it is greater than zero then it will enter the while loop
First reduce the caller number by one then we take the modulus of the column number to get the remainder and add it into the letter A so that we get the exact letter and append it to the string
And again reduces by dividing it by 26
Then returning the string in reverse order and as a string as we have used string builder

*/
