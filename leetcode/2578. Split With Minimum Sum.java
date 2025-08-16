class Solution {
    public int splitNum(int num) {
        int[] arr = new int[String.valueOf(num).length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int num1=0,num2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) num1=num1*10+arr[i];
            else num2=num2*10+arr[i];
        }
        return num1+num2;
    }
}
