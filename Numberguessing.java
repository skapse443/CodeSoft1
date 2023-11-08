import java.util.Scanner;
 
public class Numberguessing {
 
    
    public static void guessingNumberGame()
    {
        
        Scanner sc = new Scanner(System.in);
 
        
        int number = 1 + (int)(10* Math.random());
		int K = 5;
		int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");
 
        
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            guess = sc.nextInt();
 
            
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You completed all your trial " + " K trials.");
			System.out.println( "The number was " + number);
			System.out.println("Do you want to play again:Yes");
			if("yes")
				
			Scanner sc=new Scanner(System.in);
			int choice;
			choice=input.nextline();
		    
            
        }
    }
  public static void main(String arg[])
    {
 
        guessingNumberGame();
    }
}