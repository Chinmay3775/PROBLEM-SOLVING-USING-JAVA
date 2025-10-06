class Solution {
    public String interpret(String c) {
        int len = c.length();
        String result="";
        for(int i =0 ;i<len ;i++){
            if(c.charAt(i)=='G') result+="G";
            
            else if(c.charAt(i)=='(' && c.charAt(i+1)==')') {
                result+="o";
                i++;
            }

            else {
                result+="al";
                i=i+3;
            }
        }
        return result;
    }
}
