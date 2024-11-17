class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        while(area%w!=0){
            w-=1;
        }
        int l=area/w;
        return new int[]{l,w};
    }
}
