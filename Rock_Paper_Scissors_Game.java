```java
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rps = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computerInt = random.nextInt(rps.length);
        String computerChoice = rps[computerInt];
        System.out.println("Enter Rock, Paper or Scissors:");
        String userChoice = scanner.nextLine();
        System.out.println("Computer chose: " + computerChoice);
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equalsIgnoreCase("Rock")) {
            if (computerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoice.equalsIgnoreCase("Paper")) {
            if (computerChoice.equalsIgnoreCase("Rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (userChoice.equalsIgnoreCase("Scissors")) {
            if (computerChoice.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else {
            System.out.println("Invalid user input.");
        }
    }
}
```