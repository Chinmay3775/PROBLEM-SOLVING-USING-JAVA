class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;

        if(!word.matches("[a-zA-Z0-9]+")) return false;

        if(!word.matches(".*[aeiouAEIOU].*")) return false;

        if(!word.matches(".*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*")) return false;
        return true;
    }
}
