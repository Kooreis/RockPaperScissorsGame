while (true)
{
    Console.WriteLine("Enter Rock, Paper or Scissors (or Quit to exit): ");
    userChoice = Console.ReadLine();

    if (userChoice.ToLower() == "quit")
    {
        break;
    }
}