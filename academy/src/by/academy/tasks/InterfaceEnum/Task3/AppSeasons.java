package by.academy.tasks.InterfaceEnum.Task3;

import by.academy.lesson10.classwork.Season;

public class AppSeasons {

	public static void main(String[] args) {
		Seasons summer = Seasons.SUMMER;
		Seasons winter = Seasons.WINTER;
		System.out.println(summer.getDescription());
		System.out.println(winter.getDescription());
		
		myFavorite(Seasons.WINTER);
	}

	public static void myFavorite(Seasons season) {
		switch (season) {
		case SUMMER:
			System.out.println("I like summer");
			break;
		case WINTER:
			System.out.println("I like winter");
			break;
		case SPRING:
			System.out.println("I like spring");
			break;
		case FALL:
			System.out.println("I like fall");
			break;
		}
	}

}
