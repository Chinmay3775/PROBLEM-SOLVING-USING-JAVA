// class Solution {
//     public int fib(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         int[] fibCache = new int[n + 1];
//         fibCache[0] = 0;
//         fibCache[1] = 1;
//         for (int i = 2; i <= n; i++) {
//             fibCache[i] = fibCache[i - 1] + fibCache[i - 2];
//         }
//         return fibCache[n];
//     }
// }
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return F(n);
    }
    static int F(int n){
        int a=0;
        int b=1;
        int count =2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count ++;
        }
        return b;
    }
}
