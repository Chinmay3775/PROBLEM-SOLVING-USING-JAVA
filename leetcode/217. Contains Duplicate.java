//Solution 1
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
}
//Solution 2
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i:nums){
            if(map.contains(i)){
                return true;
            }
            map.add(i);
        }
        return false;
    }
}

//Solution 3
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();

    for(int i : nums){
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(1<map.get(i)){
                return true;
            }
        }
        return false;
    }
}
