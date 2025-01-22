class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
  char[] charArray1 = magazine.toCharArray();
        char[] charArray2 = ransomNote.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        int i = 0, j = 0;
        while (i < charArray1.length && j < charArray2.length) {
            if (charArray1[i] == charArray2[j]) {
                j++; 
            }
            i++; 
        }

        return j == charArray2.length;
    }
}
