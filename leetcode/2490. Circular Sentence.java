    class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            char lastChar = words[i].charAt(words[i].length() - 1);
            char firstCharNext = words[(i + 1) % words.length].charAt(0);
            if (lastChar != firstCharNext) {
                return false;
            }
        } 
        return true;
    }
}
