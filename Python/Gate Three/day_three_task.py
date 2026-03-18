def task_one (numbers, list_size):

	new_number = []

	for index in range(list_size):

		if (index < len(numbers)):

			new_number.append(numbers[index])

		else:
			new_number.append(-1)

	return new_number

def task_three(numbers):

	numberIndex = [0,0]
	largest = numbers[0][0]

	for rowIndex in range(len(numbers)):
		for columnIndex in range(len(numbers[rowIndex])):
			if (numbers[rowIndex][columnIndex] > largest):
				largest = numbers[rowIndex][columnIndex]
				numberIndex[0] = rowIndex
				numberIndex[1] = columnIndex

	return numberIndex

def task_two(word):

	outcome = ""
	for index in range(len(word)):
		count = 0
		letter = word[index]
		if letter not in outcome:
			for val in range(len(word)):
				if letter == word[val]:
					count += 1
			outcome += f"{letter}{count}"
	return outcome