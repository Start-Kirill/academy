/*
 * Homework #4. Task #2
 * 
 * Kirill Starovoitov
 */
package by.academy.homework4.Task2;

public class Body {
	private Heart heart;
	private Lungs lungs;

	public Body() {
		super();
		heart = new Heart();
		lungs = new Lungs();
	}

	public Heart getHeart() {
		return heart;
	}

	public Lungs getLungs() {
		return lungs;
	}

	public void live() {
		lungs.live();
		heart.live();
		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. "
				+ "And I believe that you are free, and life has only begun.");
	}

	private class Heart {
		Heart() {
			super();
		}

		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if (i % 100 == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");
				}
			}
		}
	}

	private class Lungs {
		Lungs() {
			super();
		}

		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if (i % 50 == 0) {
					System.out.println("breathe in");
				}
				if (i % 100 == 0) {
					System.out.println("breathe out");
				}
			}
		}
	}

}
