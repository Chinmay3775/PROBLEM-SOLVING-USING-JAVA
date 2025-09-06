class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // List<Integer> l1= new ArrayList<>();
        // List<Integer> l2= new ArrayList<>();
        // List<Integer> l3= new ArrayList<>();
        // for(int i : nums){
        //     if(i<pivot){
        //         l1.add(i);
        //     }
        //     else if(i>pivot){
        //         l2.add(i);
        //     }
        //     else{
        //         l3.add(i);
        //     }
        // }
        // l1.addAll(l3);
        // l1.addAll(l2);

        // return  nums = l1.stream().mapToInt(Integer::intValue).toArray();

        int[] result = new int[nums.length];
        int idx=0;
        for(int i:nums){
            if(i<pivot) result[idx++]=i;
        }
        for(int i:nums){
            if(i==pivot) result[idx++]=i;
        }
        for(int i:nums){
            if(i>pivot) result[idx++]=i;
        }
        return result;
    }
}
