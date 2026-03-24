import java.util.Scanner;
public class MiniParkingSystemApp{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		
		String mainMenu = """
		WELCOME TO SEMICOLON PARKING LOT!

		1. Park Automatically
		2. Park Manually
		3. Unpark Car
		4. View Parking Space Status

		""";

		String continueAction = "yes";

		while (continueAction.equals("yes")){
			System.out.println("=".repeat(70));
			System.out.println(mainMenu);
			System.out.println("=".repeat(70));

			String choice = input.next().trim();

			switch(choice){
				case "1":
					MiniParkingSystem.parkAutomatically();
					MiniParkingSystem.outputStatus();
					break;

				case "2":
					System.out.println("Enter Space Number");
					int space = input.nextInt();
					if (MiniParkingSystem.spaceAvailability(space) == true){
						System.out.println("Space is occupied");
						MiniParkingSystem.outputStatus();

					}
					else{
						MiniParkingSystem.parkManually(space);
						MiniParkingSystem.outputStatus();
					}
					break;

				case "3":
					System.out.println("Enter Space Number");
					space = input.nextInt();

					if (MiniParkingSystem.spaceAvailability(space) == false){
						System.out.println("No car parked in the space");
						MiniParkingSystem.outputStatus();
					}

					else{
						MiniParkingSystem.unparkCar(space);
					}
					break;

				case "4":
					MiniParkingSystem.outputStatus();
					break;
			
				default:
					System.out.println("Invalid Input");
			}

			input.nextLine();
			System.out.println("Do you want to perform another operation? (yes/no)");
			continueAction = input.nextLine();
			while (!continueAction.equals("yes") && !continueAction.equals("no")){
				System.out.println("Do you want to perform another operation? (yes/no)");
				continueAction = input.nextLine();
			}
		}
	}


}