class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char li = Character.toLowerCase(s.charAt(i));
            char lj = Character.toLowerCase(s.charAt(j));
            while (i < j && !Character.isLetterOrDigit(li)) {
                i++;
                li = Character.toLowerCase(s.charAt(i));
            }
            while (i < j && !Character.isLetterOrDigit(lj)) {
                j--;
                lj = Character.toLowerCase(s.charAt(j));
            }
            if (li != lj) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
