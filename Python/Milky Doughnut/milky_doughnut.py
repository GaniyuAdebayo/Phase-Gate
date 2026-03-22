def sorted_number(numbers):
	for value in range(len(numbers)):
		smallest = numbers[value]
		for index in range(value+1, len(numbers)):
			if (numbers[index] < smallest):
				smallest = numbers[index]
				numbers[index] = numbers[value]
				numbers[value] = smallest
	return numbers
			
def count_evens(numbers):
	count = 0
	for value in numbers:
		if (value % 2 == 0):
			count += 1
	return count

def linear_search(numbers, target):
	for value in range(len(numbers)):
		if (numbers[value] == target):
			return value
	return -1	


def squares(number):

	if (number > 0):
		n_squares = []
		for value in range(1, number + 1):
			n_squares.append(value ** 2)
		return n_squares

	return [-1]

def remove_duplicates(numbers):
	new_numbers = []
	for value in numbers:
		if value not in new_numbers:
			new_numbers.append(value)
	return new_numbers

def arrays_equal(a, b):
	if ((sorted_number(a) == sorted_number(b)) and (len(a) == len(b))):
		return True
	return False

def flatten(matrix):
	new_matrix = []
	count = 0
	for value in range(len(matrix)):
		for index in range(len(matrix[value])):
			new_matrix.append(matrix[value][index])
	return new_matrix



	