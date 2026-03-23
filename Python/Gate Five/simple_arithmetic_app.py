#import Random
#generate 2 random numbers
#if first number is less than second number, generate another second number
#on each question, allow user to input the answer
#if answer is wrong on first attempt, allow user to input on second attempt
#if second attempt is wrong, the next question should be displayed
#display 10 questions to the user one after the other
#give a summary of questions asked, questions answered correctly, and those missed.
#display the score in percentage

import random

count = 1
noOfCorrectAnswers = 0
while (count <= 10):
	print(f"Question {count}")
	first_number = random.randrange(101)
	second_number = random.randrange(101)

	while (second_number > first_number):
		second_number = random.randrange(101)

	answer = int(input(f"{first_number} - {second_number} = "))

	if ((first_number - second_number) != answer):
		answer = int(input(f"{first_number} - {second_number} = "))

	if ((first_number - second_number) == answer):
		noOfCorrectAnswers += 1

	count += 1

print(f"\nYour score is {noOfCorrectAnswers * 10}%")