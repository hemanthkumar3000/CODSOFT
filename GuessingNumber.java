import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class GuessingNumber{
    public static void main(String[] args)
    {
       
        Random rand= new Random();//generates the number in random
        int num = rand.nextInt(100) + 1; //the number is range of 1 to 100
        int limit=10;// the game  has only 10 tries
        int score=0;
        while(true)
        {

        Scanner  sc= new Scanner(System.in);
        System.out.println("I have randomly picked the number the number in 1 to 100.\n You have 10 tries!");
        boolean answer=false;
        while(limit>0){
            System.out.println("Enter the number: ");
            int guess=sc.nextInt();
            if(guess==num)
            {
                System.out.println("You have WON!");
                answer=true;
                score++;
                break;
            }
            else if(guess>num){
                System.out.println("Your Guess has too high! You have "+ (limit-1)+ " tries left");
                limit--;
            }
            else
            {
                System.out.println("Your Guess has too low! You have "+(limit-1)+" tries left");
                limit--;
            }
            
        }
        if(answer=false)
        {
            System.out.println("You have run out of attempts!");
            System.out.println("You LOST!");
            System.out.println("The correct number was: "+num);
        }
        System.out.println("\nYour current score: " + score);
        System.out.print("\nDo you want to play again? (yes/no): ");
        String playAgain = sc.next();

        if (!playAgain.equalsIgnoreCase("yes")) {
            System.out.println("\nThank you for playing! Your final score is: " + score);
            break;
        }
        sc.close();
     }
        
    }
}