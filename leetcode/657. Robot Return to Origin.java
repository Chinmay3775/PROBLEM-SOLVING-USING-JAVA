class Solution {
    public boolean judgeCircle(String moves) {
        // int up=0,down=0,left=0,right=0;
        // for(int i=0;i<moves.length();i++){
        //     if(moves.charAt(i)=='U') up++;
        //     else if(moves.charAt(i)=='D') down++;
        //     else if(moves.charAt(i)=='L') left++;
        //     else if(moves.charAt(i)=='R') right++;
        // }

        // return up==down && left==right;

        int x=0,y=0;
        for(char move: moves.toCharArray()){
            switch(move){
              case 'U' : y++; break;
              case 'D' : y--; break;
              case 'L' : x++; break;
              case 'R' : x--; break;

            }
        }
        return x==0&&y==0;
    }
}
