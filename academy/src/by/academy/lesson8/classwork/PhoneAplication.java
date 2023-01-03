package by.academy.lesson8.classwork;

public class PhoneAplication {

	public static void main(String[] args) {
		Phone motorola = new Phone(1234564234789l, 123.45, "E395");
		Phone siemens = new Phone(1243435324453l, 135.54, "M95");
		Phone nokia = new Phone(12345442365442l, 350.546, "3310");

		System.out.println(motorola);

		System.out.println(siemens);

		System.out.println(nokia);

		motorola.receiveCall("Sergey");
		motorola.receiveCall("Sergey", 132456789);
		motorola.sendMessage(12143243234654l, 46546876464984l, 54898443298l, 454234234465465l);

	}

}
