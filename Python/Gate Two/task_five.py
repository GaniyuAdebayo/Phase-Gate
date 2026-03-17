number = int(input("Enter a number: "))

while (number < 0):
	number = int(input("Enter a positive number: "))
product = 1

for value in range(number, 0, -1):

	product *= value

print(f"{number}! = {product}")