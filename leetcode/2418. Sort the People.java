class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> heights[b]-heights[a]);
        for(int i=0;i<heights.length;i++){
           pq.offer(i); 
        }
        String[] str = new String[names.length];
        int k=0;
        while(!pq.isEmpty()){
            str[k++]=names[pq.poll()];
        }
        return str;
    }
}
