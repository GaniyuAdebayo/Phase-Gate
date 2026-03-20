def prime_number(number):
	count = 0;
	is_prime = True
	for value in range(1, number // 2):
		if (number%value == 0):
			count += 1
		if (count == 2):
			is_prime = False
			break
	return is_prime

def perfect_square(number):
	is_perfect_square = False
	for value in range(1, number):
		if (value ** 2 == number):
			is_perfect_square = True
			break
	return is_perfect_square
		
def task_one(numbers):
	prime_numbers = []
	for number in numbers:
		if (prime_number(number) == True):
			prime_numbers.append(number)
	return prime_numbers

def task_two(numbers):

	for index in range(len(numbers)):
		if (numbers[index] < 0):
			numbers[index] = 0
	return numbers

def task_three(numbers):
	new_list = []
	for number in numbers:
		if (number != 0):
			new_list.append(number)

	if (len(new_list) < len(numbers)):
		for val in range(len(new_list), len(numbers)):
			new_list.append(0)

	return new_list

def task_five(numbers):
	new_list = [[],[]]
	for number in numbers:
		if (number % 2 == 0):
			new_list[1].append(number)
		else:
			new_list[0].append(number)
	return new_list

def task_six(numbers):
	is_palindrome = True
	for index in range(len(numbers)//2):
		if (numbers[index] != numbers[len(numbers) - 1 - index]):
			is_palindrome = False
	return is_palindrome

def task_seven(numbers):
	perfect_squares = []
	for number in numbers:
		if (perfect_square(number) == True):
			perfect_squares.append(number)
	return perfect_squares

def task_eight(numbers):
	for index in range(len(numbers)):
		if (perfect_square(numbers[index]) == False):
			numbers[index] = -1
	return numbers
	