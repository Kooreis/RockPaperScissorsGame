# Python Documentation

# Rock, Paper, Scissors Game

This Python script is a simple implementation of the classic game "Rock, Paper, Scissors". The user plays against the computer, which makes its choices at random.

## How it works

The game is run in a continuous loop until the user decides to stop playing. In each round, the user is asked to enter their choice of "rock", "paper", or "scissors". The computer's choice is then generated randomly from the same set of options.

The game's outcome is determined by the rules of Rock, Paper, Scissors:

- Rock smashes scissors (Rock wins)
- Scissors cut paper (Scissors wins)
- Paper covers rock (Paper wins)

If both the user and the computer make the same choice, the game is a tie.

After the outcome is announced, the user is asked if they want to play again. If they choose not to, the game ends.

## Imported Libraries

The script imports one library: `random`. This library is used to generate the computer's choice. The `random.choice()` function takes a list as an argument and returns a randomly selected element from that list.

## Usage

To play the game, simply run the script in a Python environment. You will be prompted to enter your choice and whether or not you want to play again after each round.

---

# C# Documentation

# Rock Paper Scissors Game in C#

This repository contains a simple console-based Rock Paper Scissors game implemented in C#. The game allows a user to play the classic game of Rock, Paper, Scissors against the computer. The game continues until the user decides to quit.

## Script Explanation

The script is a simple implementation of the Rock, Paper, Scissors game. The user is prompted to enter their choice of "Rock", "Paper", or "Scissors". The computer's choice is randomly selected from the same options. The game then compares the user's choice and the computer's choice to determine the winner. The game keeps track of the score and displays it after each round. The game continues in a loop until the user enters "Quit".

## Libraries Used

The script uses the following libraries:

- `System`: This is a built-in C# library that provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used for console input/output and to generate random numbers.

## Code Breakdown

- The `choices` array stores the possible choices ("Rock", "Paper", "Scissors") for the game.
- The `Random` class is used to generate a random number which is used to select the computer's choice from the `choices` array.
- The `while (true)` loop keeps the game running until the user decides to quit by entering "Quit".
- The `if` statements inside the loop compare the user's choice and the computer's choice to determine the winner of each round.
- The `userScore` and `computerScore` variables keep track of the score.

## How to Run

To run the script, you need a C# compiler. If you have the .NET SDK installed, you can use the `dotnet run` command in the terminal from the directory where the script is located.

---

# Java Documentation

# Rock, Paper, Scissors Game in Java

This repository contains a simple implementation of the classic game "Rock, Paper, Scissors" in Java. The game is played between a user and the computer. The user inputs their choice and the computer's choice is determined randomly. The winner is then decided based on the rules of the game.

## Code Explanation

The script is written in Java and uses two imported libraries:

- `java.util.Random`: This library is used to generate random numbers. In this script, it is used to randomly determine the computer's choice (Rock, Paper, or Scissors).

- `java.util.Scanner`: This library is used to read the user's input. In this script, it is used to get the user's choice (Rock, Paper, or Scissors).

The script begins by creating an array of strings representing the possible choices (Rock, Paper, Scissors). It then generates a random integer which is used to index into this array and determine the computer's choice.

The script then prompts the user to enter their choice. The user's choice and the computer's choice are compared and the winner is determined according to the rules of the game. If the user's choice is the same as the computer's, it's a tie. If the user's choice beats the computer's, the user wins. Otherwise, the computer wins.

If the user enters anything other than Rock, Paper, or Scissors, the script informs the user that their input is invalid.

## How to Run

To run the script, you need to have Java installed on your machine. You can then compile the script using the Java compiler (`javac`) and run it using the Java interpreter (`java`).

```bash
javac Main.java
java Main
```

You will then be prompted to enter your choice (Rock, Paper, or Scissors). After you enter your choice, the computer's choice will be displayed and the winner will be announced.

---
