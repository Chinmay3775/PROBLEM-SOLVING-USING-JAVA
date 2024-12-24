import java.util.Scanner;
import java.util.Random;

class handle_number{
    int lb=1;
    int up=100;
    int max_atp=5;
    int score=0;
    boolean playagain =true;

    Random r = new Random();
    int rn=r.nextInt(up-lb+1)+lb;
    void show(){
        System.out.println(rn);    
    }
}
public class Number_game {
    public static void main(String[] args) {
        System.out.println("Guess the number Between 0-100: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<=100){
        handle_number obj= new handle_number();
        obj.show();
        }
        else System.err.println("Enter the Number within the Range!!");
        
    }
}
