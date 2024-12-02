class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into words using spaces as delimiters
        String[] words = sentence.split(" ");
        
        // Iterate through the words to check for the prefix
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }
        
        return -1; // If no word is found
    }
}
