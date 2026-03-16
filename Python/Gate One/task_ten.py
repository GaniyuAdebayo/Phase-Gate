sum = 0.0
for value in range(1, 4):

	number = float(input(f"Enter number {value}: "))

	sum += number

print(f"The average of the numbers is {sum/3}")