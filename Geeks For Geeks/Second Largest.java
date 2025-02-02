class Solution {
    public int getSecondLargest(int[] arr) {
         
        int l=arr.length;
        int largest=-1,secondLargest=-1;
        for(int i=0;i<l;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest&&arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }
}
