class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] result =new int[2];
        int[] idx={0};
        map.forEach((key,value)->{
            if(value>1 && idx[0]<2){
                result[idx[0]++]=key;
            }
        });
        return result;
    }
}
