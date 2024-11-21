class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if the strings are null or of different lengths
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Map to store character mappings from `s` to `t`
        Map<Character, Character> map = new HashMap<>();

        // Iterate through the strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if `charS` is already mapped
            if (map.containsKey(charS)) {
                // If mapped character doesn't match `charT`, return false
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                // Check if `charT` is already mapped to another character
                if (map.containsValue(charT)) {
                    return false;
                }
                // Add the mapping
                map.put(charS, charT);
            }
        }
        return true; // Strings are isomorphic
    }
}
