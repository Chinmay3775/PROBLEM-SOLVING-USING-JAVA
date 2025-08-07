class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int len=words.length;
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i<len ; i++){
            // String s = words[i];
            if(words[i].indexOf(x)!=-1){
                list.add(i);
            }
        }
        return list;
    }
}
