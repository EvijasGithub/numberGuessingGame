import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void numberGuessingGame() {
        Scanner scanner=new Scanner(System.in);
        //Generating a random number
        Random random=new Random();
        int number=random.nextInt(50)+1;
        //System.out.println(number);
        //Logic,output
        while (true){
            System.out.println("Welcome to the Number Guessing Game! Choose a number between 1 and 50:");
            int answer=scanner.nextInt();
            if(number==answer){
                System.out.println("You guessed the number!");
                break;
            }else if(number<answer){
                System.out.println("Too high.");
            }else {
                System.out.println("Too low.");
            }
        }
        }
    //Calling a function
    public static void main(String[] args) {
        numberGuessingGame();
    }
    }

