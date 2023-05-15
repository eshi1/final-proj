import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean choice = false;

        //introduction
        System.out.println("Hello! Welcome to the Genshin-Impact-Adjacent Game, a luck based gacha game with the capability of giving you that brief serotonin boost from playing a game of chance.");
        
        //the rolling set up
        while (!choice){
            System.out.println("Enter 'y' to start rolling. Enter 'x' to exit game");
            String x = sc.nextLine();
            if (x.equals("y")){
                Gacha.setZero();
                Gacha.rolling(10);
                choice=false;
            }
            else if (x.equals("x")){
                System.out.println("You have ended the game. I hope you enjoyed pulling");
                choice=true;
            }
            else{
                System.out.println("The command "+choice+" was not recognized");
                choice=false;
              }
           
        }
    }
}