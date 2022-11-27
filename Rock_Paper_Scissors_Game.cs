```CSharp
using System;

namespace RockPaperScissors
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] choices = { "Rock", "Paper", "Scissors" };
            Random rand = new Random();
            string computerChoice, userChoice;
            int computerScore = 0, userScore = 0;

            while (true)
            {
                Console.WriteLine("Enter Rock, Paper or Scissors (or Quit to exit): ");
                userChoice = Console.ReadLine();

                if (userChoice.ToLower() == "quit")
                {
                    break;
                }

                computerChoice = choices[rand.Next(choices.Length)];
                Console.WriteLine("Computer chose " + computerChoice);

                if (userChoice == computerChoice)
                {
                    Console.WriteLine("It's a draw!");
                }
                else if ((userChoice == "Rock" && computerChoice == "Scissors") ||
                         (userChoice == "Paper" && computerChoice == "Rock") ||
                         (userChoice == "Scissors" && computerChoice == "Paper"))
                {
                    Console.WriteLine("You win!");
                    userScore++;
                }
                else
                {
                    Console.WriteLine("Computer wins!");
                    computerScore++;
                }

                Console.WriteLine("Score: You - " + userScore + " Computer - " + computerScore);
            }
        }
    }
}
```