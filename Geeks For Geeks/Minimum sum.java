import java.util.*;

class Solution {
    public String minSum(int[] arr) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean flag = true;
        
        // Step 2: Split digits alternately between sb1 and sb2
        for (int i : arr) {
            if (flag) {
                sb1.append(i);
            } else {
                sb2.append(i);
            }
            flag = !flag;
        }
        
        // Step 3: Add the two numbers represented by sb1 and sb2
        int i = sb1.length() - 1, j = sb2.length() - 1, carry = 0;
        StringBuilder ans = new StringBuilder();
        
        // Add the two strings from right to left
        while (i >= 0 || j >= 0 || carry == 1) {
            int val1 = i >= 0 ? sb1.charAt(i) - '0' : 0;
            int val2 = j >= 0 ? sb2.charAt(j) - '0' : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            ans.append((sum % 10));
            i--;
            j--;
        }
        
        // Step 4: Reverse the result since it was built in reverse order
        ans.reverse();
        
        // Step 5: Remove leading zeros
        int z = 0;
        while (z < ans.length() && ans.charAt(z) == '0') {
            z++;
        }
        
        // Return the result without leading zeros
        return ans.substring(z);
    }
}
