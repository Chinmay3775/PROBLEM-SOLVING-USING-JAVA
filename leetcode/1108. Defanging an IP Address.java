class Solution {
    public String defangIPaddr(String address) {
        // String result="";
        // for(int i = 0;i<address.length();i++){
        //     if(address.charAt(i)=='.'){
        //         result=result+'[';
        //         result=result+'.';
        //         result=result+']';
        //     }
        //     else result=result+address.charAt(i);
        // }
        // return result;

        return address.replaceAll("[.]","[.]");  // it replaceses all the occurances of . to [.] and return the result;
    }
}
