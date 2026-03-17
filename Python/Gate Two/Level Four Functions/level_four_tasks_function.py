def task_one(num1, num2):
	return num1 + num2

def task_two(number):
	if (number % 2 == 0):
		return True

	return False

def task_three(number):

	return number ** 2

def task_four(celcius_temp):

	return (1.8 * celcius_temp) + 32

def task_five(number):
	counter = 0
	for value in range(1, number//2 + 2):

		if (number % value == 0):
			counter += 1

	if (counter == 1):
		return True

	return False

def task_six(num1, num2, num3):
	largest = num1
	if (num2 > largest):
		largest = num2

	if (num3 > largest):
		largest = num3

	return largest

def task_seven(principal, rate, time):

	if (principal <= 0 or rate <= 0 or time <= 0):

		raise ValueError("Argument cannot be negative")

	return (principal * rate * time)/100.0

def task_eight():

	for value in range(1, 13):

		for number in numbers:

			print(f"{value} X {number} = {value * number}")

		print()

def task_nine(length, width):

	if (length < 0 or width < 0):
		raise ValueError("Argument cannot be negative")
	return length * width

def task_ten(number):

	new_number = 0;
	while (number != 0):
		new_number = (new_number * 10) + (number % 10)
		number //= 10

	return new_number

