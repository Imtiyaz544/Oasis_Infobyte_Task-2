import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
      int secretNumber;
            System.out.print("Enter a secret number \nYou will have Maximum 5 Attempts ");
            int attempt = 1;
            Scanner keyboard = new Scanner(System.in);
            secretNumber =  keyboard.nextInt();  
            int guess;
            do {
                  System.out.print("Enter a guess between 1-100: ");
                  guess = keyboard.nextInt();
                  if (guess == secretNumber)
                  {
                      System.out.println("Your guess is correct. Congratulations!");
                      break;
                  }
                  else if (guess < secretNumber)
                        System.out.println("Your guess is smaller than the secret number.");
                  else if (guess > secretNumber)
                        System.out.println("Your guess is greater than the secret number.");
                   if(attempt == 5) 
                   {
                    System.out.println("You have exceeded the maximum attempt. ");
                    System.out.println("You loose! the right answer was: "+secretNumber);
                    break;
                   }
                attempt++;
            } while (guess != secretNumber);
 }
}