number = int(input("Enter a number: "))

sum = 0;

for value in range(1, number + 1):

	sum += value

print(f"The sum of numbers from 1 to {number} is {sum}")