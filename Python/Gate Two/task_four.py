number = int(input("Enter a number: "))

for value in range(1, 13):

	print(f"{number:>3} X {value: <3} = {value * number : <3}")