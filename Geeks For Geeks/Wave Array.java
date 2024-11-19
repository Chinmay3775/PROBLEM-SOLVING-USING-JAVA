class Solution {
    public static void convertToWave(int[] arr) {
        // code here
        int len=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<len-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
}
