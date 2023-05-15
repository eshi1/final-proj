import java.util.Random;
public class Gacha {
    public static int count4=0;
    public static int count5=0;
    
    //resets the count for the # of 4 stars and 5 stars
    public static void setZero(){
        count4=0;
        count5=0;
    }

    //generates the 4 star and 5 star pulls using iteration
    //also outputs number of 4 stars and 5 stars received
    public static void rolling(int n){
        Characters.charas();
        
        if (n==0){
            System.out.println("You got "+count4+" four stars and "+count5+" five stars in this pull.");
            int luck = (count4*3+count5*5);
            if (luck==0){
                System.out.println("You were really unlucky with your pull. I wouldn't reccomend buying a lottery ticket today");
            }
            else if (luck<8){
                System.out.println("You have average luck on your pull. Maybe you'll win the lottery, maybe you won't");
            }
            else{
                System.out.println("You were really lucky with your pull! Go buy a lottery ticket!! You might have a chance to win");
            }
        }
        else{
            int x = (int)(Math.random()*328);
            if (x>=285 && x<=320){
                //System.out.print(x);
                count4+=1;
            }
            else if (x>=321){
                //System.out.print(x);
                count5+=1;
            }
            System.out.println("\u001B[0m"+Characters.allchars[x]+"\u001B[33m");
            n--;
            rolling(n);
        }
    }
}
