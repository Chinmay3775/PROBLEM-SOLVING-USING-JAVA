class Solution {
    static int minRepeats(String s1, String s2) {
        // Check if s2 contains any characters not in s1
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains(String.valueOf(s2.charAt(i)))) {
                return -1;
            }
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (sb.length() < s2.length()) {
            sb.append(s1);
            count++;
        }

        if (sb.toString().contains(s2)) {
            return count;
        }

        sb.append(s1);
        count++;

        if (sb.toString().contains(s2)) {
            return count;
        }

        return -1;
    }
}
