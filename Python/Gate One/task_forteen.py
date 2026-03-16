number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))

if (number1 > number2):
	print(f"{number1} is greater")
elif (number1 < number2):
	print(f"{number2} is greater")
else:
	print(f"{number1} is equal to {number2}")