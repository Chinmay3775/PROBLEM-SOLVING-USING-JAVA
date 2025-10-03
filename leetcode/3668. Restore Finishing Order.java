class Solution {
    public int[] recoverOrder(int[] o, int[] f) {
        int[] result = new int[f.length];
        int idx=0;
        for(int i =0;i<o.length;i++){
            for(int j=0;j<f.length;j++){
                if(o[i]==f[j]){
                    result[idx++]=o[i];
                }
            }
        }
        return result;
    }
}
