class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        int maxdia=0;
        for(int i=0;i<dimensions.length;i++){
            int len=dimensions[i][0];
            int bre=dimensions[i][1];
                int dia=(len*len)+(bre*bre);
                int area=len*bre;

                if(dia>maxdia||dia==maxdia && area>maxArea) {
                    maxdia=dia;
                    maxArea=len*bre;
                }
                    
        }
        return maxArea;
    }
}
