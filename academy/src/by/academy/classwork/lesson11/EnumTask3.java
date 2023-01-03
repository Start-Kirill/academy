package by.academy.classwork.lesson11;

public class EnumTask3 {

	public static void main(String[] args) {
		Seasons season = Seasons.SUMMER;

		System.out.println(season.getTemprature());
		getInformation(season);

	}

	static public void getInformation(Seasons s) {
		switch (s) {
		case SUMMER:
			System.out.println("I like summer!");
			break;
		case WINTER:
			System.out.println("I like winter!");
			break;
		case SPRING:
			System.out.println("I like Spring!");
			break;
		case AUTUAMN:
			System.out.println("I like Autuamn!");
			break;

		}

	}
}
