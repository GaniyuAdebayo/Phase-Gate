number = int(input("Enter a number: "))

new_number = number
counter = 0

while(new_number != 0):

	new_number //= 10
	counter += 1

print(f"{number} has {counter} digits")