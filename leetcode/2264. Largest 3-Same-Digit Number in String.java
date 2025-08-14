class Solution {
    public String largestGoodInteger(String num) {
        // String str="";
        // for(int i=0;i<=num.length()-3;i++){
        //     char a=num.charAt(i);
        //     char b=num.charAt(i+1);
        //     char c=num.charAt(i+2);
        //     if(a==b&&b==c){
        //         String temp=num.substring(i,i+3);
        //         if(str.compareTo(temp)<0){
        //         str=temp;
        //         }
        //     }
        // }
        // return str;

        String[] str={"999","888","777","666","555","444","333","222","111","000"};
        for(String i : str){
            if(num.contains(i)) return i;
        }
        return "";
    }
}
