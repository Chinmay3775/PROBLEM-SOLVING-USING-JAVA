class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")) --num;
            if(operations[i].equals("X--")) num--;
            if(operations[i].equals("++X")) ++num;
            if(operations[i].equals("X++")) num++;
        }
        return num;
    }
}
