class Solution {
    public String convertDateToBinary(String date) {
        String[] str=date.split("(?=-)|(?<=-)");
        String result="";
        for(String w:str){
            if(!w.equals("-")) result+=Integer.toBinaryString(Integer.parseInt(w));
            else result+="-";
        }
        return result;
    }
}
