import random

def game():
    while True:
        user_choice = input("Enter a choice (rock, paper, scissors): ")
        possible_actions = ["rock", "paper", "scissors"]
        computer_choice = random.choice(possible_actions)