class Solution {
    public boolean isHappy(int n) {
        
        int sum, digit;
        
        while (n != 1 && n != 4) { 
            sum = 0;
            
            while (n > 0) {
                digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            
            n = sum; 
        }

        return n == 1; 
    }
}

    
