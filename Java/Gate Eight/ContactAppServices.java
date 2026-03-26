import java.util.ArrayList;
public class ContactAppServices{

	public boolean validatePhoneNumberIsPresent(ArrayList<User> usersDetails, String phoneNumber){
		for (User details : usersDetails){
			if (details.getPhoneNumber().equals(phoneNumber)){
				return true;
			}
		}
		return false;
	}

	public void removeContact(ArrayList<User> usersDetails, String phoneNumber){
		if (validatePhoneNumberIsPresent(usersDetails, phoneNumber) == true){
			for (User details : usersDetails){
				if (details.getPhoneNumber().equals(phoneNumber)){
					usersDetails.remove(details);
				}
			}				
		}
	}

	public User findContactByPhoneNumber(ArrayList<User> usersDetails, String phoneNumber){
		if (validatePhoneNumberIsPresent(usersDetails, phoneNumber) == true){
			for (User details : usersDetails){
				if (details.getPhoneNumber().equals(phoneNumber)){
					return details;
				}
			}				
		}
		return null;
	}

	public boolean validateFirstNameIsPresent(ArrayList<User> usersDetails, String firstName){
		for (User details : usersDetails){
			if (details.getFirstName().equalsIgnoreCase(firstName)){
				return true;
			}
		}
		return false;
	}

	public User findContactByFirstName(ArrayList<User> usersDetails, String firstName){
		if (validateFirstNameIsPresent(usersDetails, firstName) == true){
			for (User details : usersDetails){
				if (details.getFirstName().equalsIgnoreCase(firstName)){
					return details;
				}
			}				
		}
		return null;
	}

	public boolean validateLastNameIsPresent(ArrayList<User> usersDetails, String lastName){
		for (User details : usersDetails){
			if (details.getLastName().equalsIgnoreCase(lastName)){
				return true;
			}
		}
		return false;
	}

	public User findContactByLastName(ArrayList<User> usersDetails, String lastName){
		if (validateLastNameIsPresent(usersDetails, lastName) == true){
			for (User details : usersDetails){
				if (details.getLastName().equalsIgnoreCase(lastName)){
					return details;
				}
			}				
		}
		return null;
	}

	public void editFirstName(ArrayList<User> usersDetails, String phoneNumber, String newFirstName){
		User user = findContactByPhoneNumber(usersDetails, phoneNumber);
		for (User details : usersDetails){
			if(details.getPhoneNumber().equals(phoneNumber)){
				details.setFirstName(newFirstName);
			}

		}
	}

	public void editLastName(ArrayList<User> usersDetails, String phoneNumber, String newLastName){
		User user = findContactByPhoneNumber(usersDetails, phoneNumber);
		for (User details : usersDetails){
			if(details.getPhoneNumber().equals(phoneNumber)){
				details.setLastName(newLastName);
			}
		}
	}

	public void editPhoneNumber(ArrayList<User> usersDetails, String phoneNumber, String newPhoneNumber){
		User user = findContactByPhoneNumber(usersDetails, phoneNumber);
		for (User details : usersDetails){
			if(details.getPhoneNumber().equals(phoneNumber)){
				details.setPhoneNumber(newPhoneNumber);
			}
		}
	}


}