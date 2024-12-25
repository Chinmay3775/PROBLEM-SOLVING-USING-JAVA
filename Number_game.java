import java.util.Scanner;
import java.util.Random;

class handle_number{
    int lb=1;
    int up=100;
    int max_atp=10;
    int score=0;
    boolean playagain =true;

    Random r = new Random(); 
    int rn=r.nextInt(up-lb+1)+lb;
   
    void reset(){
        rn=r.nextInt(up-lb+1)+lb;
        max_atp=10;

    }
    boolean guess(int num){
        if(num==rn) {
            System.out.println("You Guessed correct Number!!");
            score++;
            return true;
        }
        else if(num>rn) System.out.println("Too high! Try Again");
        else System.out.println("Too Low! TryAgain");
        max_atp--;
        if(max_atp==0){
            System.out.println("Out of attempts! The correct Number was: "+rn);
            return true;
        }
        return false;
    }
}
public class Number_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        handle_number obj= new handle_number();

        while(obj.playagain){
            System.out.println("Guess the number Between 0-100: \n You have "+obj.max_atp +" to Guess the correct Number ");
            
            while(obj.max_atp>0){
                System.out.println("Enter the Guess Number");
                int number=sc.nextInt();
                
                if(obj.guess(number)){
                    break;
                }
                
                System.out.println("Attempts Remaining:"+obj.max_atp);
            }System.out.println("1.Play Again");
            System.out.println("2.Exit");
            int play=sc.nextInt();

            switch(play){
                case 1 -> obj.reset();
                case 2->obj.playagain=false;

            }
        }
        sc.close();    
    }
}
