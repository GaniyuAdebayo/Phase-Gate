public class MiniParkingSystem{

	//static int [] parkingLot = new int [20];

	public static void parkAutomatically(int [] parkingLot){

		for (int index = 0; index < parkingLot.length; index++){
			if (parkingLot[index] == 0){
				parkingLot[index] = 1;
				System.out.printf("Your parking lot number is %d%n", index+1);
				break;
			}
		}
	}

	public static void parkManually(int [] parkingLot, int spaceNumber){

		if (spaceNumber < 1 || spaceNumber > 20){
			System.out.println("Invalid Input");
		}

		else if (parkingLot[spaceNumber - 1] == 0){
			parkingLot[spaceNumber - 1] = 1;
		}
	}

	public static void outputStatus(int [] parkingLot){
		for (int index = 0; index < parkingLot.length; index++){
			System.out.printf("""
========
Lot %d
%s				
========
			""", index+1, parkingLot[index] == 0 ? "Available" : "Occupied");
		}
	}

	public static void unparkCar(int [] parkingLot, int spaceNumber){
		if (parkingLot[spaceNumber - 1] == 1){
			parkingLot[spaceNumber - 1] = 0;
		}
	}

	
	public static boolean spaceAvailability(int [] parkingLot, int spaceNumber){
		if (parkingLot[spaceNumber - 1] == 1){
			return true;
		}
		return false;
	}

	//public static int spaceNumber(){
	//	try{
	//		System.out.println("Enter space number");
	//		int number = input.nextInt();
	//		return number;
	//	}catch (ArrayIndexOutOfBoundException || Exception e){
	//		spaceNumber();
	//	}
	//}
}