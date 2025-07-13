class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int content=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        while(i<players.length&&j<trainers.length){
            if(players[i]<=trainers[j]){
                content++;
                i++;
            }
            j++;
        }
        return content;
    }
}

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
     Arrays.sort(players);
     Arrays.sort(trainers);
     int i=0;
     int j=0;
     int count=0;
     while(i<players.length && j<trainers.length ){
            if(players[i]<=trainers[j]){
                count++;
                trainers[j]=0;
                i++;
                j++;
            }else j++;
        }
        return count;    
    }
}
