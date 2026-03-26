import java.util.Scanner;
import java.util.ArrayList;

public class ContactApp{
	public static void main (String [] args){	
		ArrayList<User> contacts = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		String mainMenu = """

		Welcome to G_World Communications

		1. Add Contact
		2. Remove Contact
		3. Find Contact by Phone Number 
		4. Find Contact by First Name
		5. Find Contact by Last Name
		6. Edit Contact
		7. Exit App

		""";

		String contactEdit = """

		1. Edit First Name
		2. Edit Last Name
		3. Edit Phone Number

		""";
		String response;

		do {
			System.out.println(mainMenu);
			response = input.next();
		

			switch(response){
				case "1":
					User users = new User();
					System.out.println("Enter first name: ");
					String firstName = input.nextLine().trim();
					users.setFirstName(firstName);
					input.nextLine();
					System.out.println("Enter last name: ");
					String lastName = input.nextLine().trim();
					users.setLastName(lastName);

					while (true){
						try{
						System.out.print("Enter phone number: ");						
						String phoneNumber = input.nextLine().trim();
						users.setPhoneNumber(phoneNumber);
						break;
						}catch(IllegalArgumentException e){
							System.out.println("Invalid Phone number!");						
						}
					}
					System.out.println("Contact Added Successfully!");
					contacts.add(users);
					break;

				case "2":

					System.out.print("Enter phone number: ");						
					String phoneNumber_1 = input.nextLine().trim();
					input.nextLine();

					if (ContactAppServices.validatePhoneNumberIsPresent(contacts, phoneNumber_1) == true){
						ContactAppServices.removeContact(contacts, phoneNumber_1);
						System.out.println("Contact removed successfully!");
					}

					else{
						System.out.println("Cannot find number!");
					}
					break;

				case "3":
		
					System.out.print("Enter phone number: ");						
					String phoneNumber_2 = input.nextLine().trim();
					if (ContactAppServices.validatePhoneNumberIsPresent(contacts, phoneNumber_2) == true){
						System.out.println(ContactAppServices.findContactByPhoneNumber(contacts, phoneNumber_2));

					}

					else{
						System.out.println("Cannot find number!");
					}
					break;

				case "4":

					System.out.println("Enter first name: ");
					String firstName_1 = input.nextLine().trim();
					System.out.println(ContactAppServices.findContactByFirstName(contacts, firstName_1));
					break;

				case "5":
					
					System.out.println("Enter last name: ");
					String lastName_1 = input.nextLine().trim();
					System.out.println(ContactAppServices.findContactByLastName(contacts, lastName_1));
					break;

				case "6":

					System.out.print("Enter phone number: ");						
					String phoneNumber_3 = input.nextLine().trim();

					if (ContactAppServices.validatePhoneNumberIsPresent(contacts, phoneNumber_3) == true){
						System.out.println(contactEdit);
						String subResponse = input.next().trim();
						switch(subResponse){
							case "1":
								System.out.println("Enter new first name: ");
								String newFirstName = input.next().trim();
								ContactAppServices.editFirstName(contacts, phoneNumber_3, newFirstName);
								System.out.println("Contact updated successfully!");
								break;
			
							case "2":

								System.out.println("Enter new last name: ");
								String newLastName = input.next().trim();
								ContactAppServices.editFirstName(contacts, phoneNumber_3, newLastName);
								System.out.println("Contact updated successfully!");
								break;

							case "3":

								System.out.println("Enter new phone number: ");
								String newPhoneNumber = input.next().trim();
								ContactAppServices.editFirstName(contacts, phoneNumber_3, newPhoneNumber);
								System.out.println("Contact updated successfully!");
								break;

							default:
								System.out.println("Invalid input!");

						}
					}

					else{
						System.out.println("Invalid Phone Number");
					}
					break;

				default:
					System.out.println("Invalid input!");

			}
		} while (response != "7");

		System.out.println("Thank you for using our App!");
	}

}