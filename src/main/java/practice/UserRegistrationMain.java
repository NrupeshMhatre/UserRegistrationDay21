package practice;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		User details = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration");
		
		
		System.out.println("Enter First name");
		String firstName =scanner.next();
		details.FirstName(firstName);
		
		System.out.println("Enter Last name");
		String lastName =scanner.next();
		details.LastName(lastName);

		 
		System.out.println("Enter Email address");
		String emailAddress = scanner.next();
		details.EmailAddress(emailAddress);	
	
		 
		System.out.println("Enter Phone number along with country code");
		String phoneNumber =scanner.next();
		phoneNumber += scanner.nextLine();
		details.PhoneNUmber(phoneNumber);	
		
		
		System.out.println("Enter Password");
		String password = scanner.next();
		details.Password(password);
		scanner.close();	

}
}
