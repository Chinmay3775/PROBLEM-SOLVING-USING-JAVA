class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp = new HashMap<>();
        Set<String> set = new HashSet<>(); 

        String[] arr =s.split(" ");
        if(arr.length!=pattern.length()) return false;

        for(int i=0;i<arr.length;i++){
        String word = arr[i];
        char ch= pattern.charAt(i);

            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(word)) return false;
            }
            else{
                if(set.contains(word)) return false;
                else{
                    mp.put(ch,word);
                    set.add(word);
                }
            }
        }
        return true;
    }
}

 /*
 So first we created two collections: a HashMap and a HashSet. In the HashMap, we keep the record of each character from the pattern and the word it is mapped with. 
 In the HashSet, we keep the record of the words that have already been mapped to ensure that no two characters map to the same word.
 While iterating, if a character is already in the HashMap, we check if it maps to the current word; if not, we return false. 
 If the character is not in the map but the word is already in the Set, we also return false. Otherwise, we add the new mapping to both the HashMap and the HashSet. 
 This ensures a consistent one-to-one mapping between pattern characters and words.
 */
