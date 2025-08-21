import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-- >0){
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
				
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++) {
                if(arr[i]>max) max=arr[i];
            }
            System.out.println(max);
        }
	}
}
