class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Check if both strings are of the same length
        s1 = s1 + s1;
        return s1.lastIndexOf(s2)>=0;
    }
}
