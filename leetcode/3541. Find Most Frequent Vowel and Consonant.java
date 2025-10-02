class Solution {
    public int maxFreqSum(String s) {
        int vowel=0,conso=0;
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(char c : s.toCharArray()){
            if("aeiou".indexOf(c)!=-1)
            map1.put(c,map1.getOrDefault(c,0)+1);
           else
            map2.put(c,map2.getOrDefault(c,0)+1);

        }
        int max1=0,max2=0;
        for(int c : map1.values()){
            max1=Math.max(max1,c);
        }
        for(int c : map2.values()){
            max2=Math.max(max2,c);
        }
        return max1+max2;
    }
}
