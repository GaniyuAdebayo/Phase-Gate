def task_one (numbers, list_size):

	new_number = []

	for index in range(list_size):

		if (index < len(numbers)):

			new_number.append(numbers[index])

		else:
			new_number.append(-1)

	return new_number