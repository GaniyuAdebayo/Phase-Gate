public class User{

	private String firstName;
	private String lastName;
	private String phoneNumber;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}	
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setPhoneNumber(String phoneNumber){

		boolean validity = true;
		for (int index = 0; index < phoneNumber.length(); index++){
			if (Character.isDigit(phoneNumber.charAt(index)) == false){
				validity = false;
				break;
			}
		}
		if (phoneNumber.length() != 11 && validity == false && !(phoneNumber.startsWith("080") || phoneNumber.startsWith("081") || phoneNumber.startsWith("070") || phoneNumber.startsWith("090")) ||phoneNumber.startsWith("091")){

			throw new IllegalArgumentException("Phone number not valid!");
		}
		this.phoneNumber = phoneNumber;		
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}

	@Override
	public String toString(){
		return String.format("First Name: %s%nLast Name: %s%nPhone Number: %s%n", getFirstName(), getLastName(), getPhoneNumber());

	}


}