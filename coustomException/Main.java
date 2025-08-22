package coustomException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email ID");
		String email = sc.next();
		System.out.println("Enter mobile number");
		String number= sc.next();
		ValidEmail(email);
		ValidoMobileNum(number);
	}

	static void ValidEmail(String email) {

		if (email.contains("@") && email.contains(".")) {
			System.out.println("email is valid");

		} else {
			throw new InvalidEmailException("Enter valid email");
		}

	}
	
	static void ValidoMobileNum(String number) {
		if(number.length()==10 && number.matches("\\d+")) {
			System.out.println("number is valid");
		}
		else {
			throw new InvalidMobileNumber("Enter valid mobile number");
		}
		
		
		
		
	}

}
