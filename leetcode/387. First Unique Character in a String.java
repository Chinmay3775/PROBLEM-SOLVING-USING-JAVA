class Solution {
    public int firstUniqChar(String s) {
    Map<Integer,Integer> map = new HashMap<>();
    char[] nums = s.toCharArray();
    for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    for(int i : nums){
        if(1==map.get(i)){
                return s.indexOf(i);
            }
        }
        return -1;
    }
}
