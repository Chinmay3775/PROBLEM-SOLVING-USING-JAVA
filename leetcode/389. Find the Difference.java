class Solution {
    public char findTheDifference(String s, String t) {
        int l=t.length();
        char c=0;
        for(int i=0;i<l;i++){
            if (i < s.length()) {
                c ^= s.charAt(i);
            }
            c ^= t.charAt(i);
        }        
        return c;
    }
}
