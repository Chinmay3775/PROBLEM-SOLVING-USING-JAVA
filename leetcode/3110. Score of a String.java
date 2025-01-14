class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int score = 0;
        for (int i = 0; i < len - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1); 
            score += Math.abs((int)a - (int)b);
        }
        return score;
    }
}
