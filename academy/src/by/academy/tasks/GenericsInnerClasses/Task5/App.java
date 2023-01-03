package by.academy.tasks.GenericsInnerClasses.Task5;

public class App {

	public static void main(String[] args) {
		Food food = new Food();
		food.prepare(pan, "Eggs");

	}

	public static Cookable pan = new Cookable() {
		public void cook(String str) {
			System.out.println(str);
		}
	};

}
