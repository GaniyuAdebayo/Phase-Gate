
def park_automatically(parking_lot):

	for index in range(len(parking_lot)):
		if (parking_lot[index] == 0):
			parking_lot[index] = 1
			print(f"Your parking lot number is {index + 1}")
			break

def park_manually(parking_lot, space):

	if (parking_lot[space - 1] == 0):
		parking_lot[space - 1] = 1

def unpark_car(parking_lot, space):

	if (parking_lot[space - 1] == 1):
		parking_lot[space - 1] = 0

def space_availability(parking_lot, space):
	
	if (parking_lot[space - 1] == 1):
		return True
		
	return False