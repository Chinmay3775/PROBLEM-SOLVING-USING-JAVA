class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s :words){
            boolean consistent=true;
                for(char c:s.toCharArray()){
                if(!allowed.contains(""+c)){
                    consistent=false;
                    break;
                }
            }
        if(consistent) count++;
        }
        return count;
    }
}
