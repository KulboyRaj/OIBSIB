
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        while (true) {
            int number, attempts = 0, score, choice, flag = 0;
            Scanner sc = new Scanner(System.in);
            double random = Math.floor(((Math.random()) * 100) + 1);
            while (true) {
                System.out.println("Guess the number between 1 to 100");
                number = sc.nextInt();
                attempts++;
                if (attempts == 11) {
                    System.out.println("Sorry attempts exhausted");
                    System.out.println("1 repeat game");
                    System.out.println("2 quite");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        break;
                    } else if (choice == 2) {
                        flag = 1;
                        break;
                    }
                }
                if (number == random) {
                    System.out.println("congratulation you guess correct number your score is : "+(((11-attempts))*10)+"/100");
                    System.out.println("1 repete game");
                    System.out.println("2 quite");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        break;
                    } else if (choice == 2) {
                        flag = 1;
                        break;
                    }
                } else if (number < random) {
                    System.out.println("Guessed number is smaller than generated");
                    System.out.println((10 - attempts) + " attempts remaining");
                } else {
                    System.out.println("Guessed number is greater than generated");
                    System.out.println((10 - attempts) + " attempts remaining");
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
}

