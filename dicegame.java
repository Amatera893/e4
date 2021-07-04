import java.util.Random;

public class dicegame
{
   public static void main(String[] args) 
   {
       Random rand = new Random();
       int[] dice = new int[2];
       System.out.println("Rolling the dice...");
       for(int i=0 ; i<2 ; i++)
       {
        dice[i]=rand.nextInt(6)+1;
        System.out.println("Dice "+(i+1)+": "+dice[i]);
       }
       System.out.println("Total value: "+(dice[0]+dice[1]));
   } 
}