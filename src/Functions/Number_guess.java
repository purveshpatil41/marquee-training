package Functions;
import java.util.*;


public class Number_guess {
    static void playGame(int n) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempt = 0;
        while(true){
            System.out.println("Enter the number: ");
            guess = sc.nextInt();
            attempt++;
            if(guess > n){
                System.out.println("High");
            } else if (guess < n) {
                System.out.println("Low");
            } else{
                System.out.println("Guess is correct! You Won");
                System.out.println("You guessed in "+ attempt);
               break;
            }
        }
    }
        public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        playGame(n);
        }
    }

