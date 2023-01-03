package by.academy.homework3.task5;

public class Validation {

	public static void main(String[] args) {
		Validator americanPhone = new AmericanPhoneValidator();
		System.out.println(americanPhone.validate("+12351111111"));
		
		Validator emValid = new EmailValidator();
		System.out.println(emValid.validate("kirill.satrovoitov22@yanbex.by"));
	
	}

}
