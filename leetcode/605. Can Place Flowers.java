class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0) return true;
        
        if (len == 1) {
            if (flowerbed[0] == 0 && n <= 1) return true; 
            return n == 0;
        }

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len - 1 || flowerbed[i + 1] == 0)) { 
                
                flowerbed[i] = 1; 
                n--;
                
                if (n == 0) return true; 
                
                i++; 
            }
        }
        
        return n == 0;
    }
}
