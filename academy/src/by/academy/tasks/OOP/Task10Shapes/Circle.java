package by.academy.tasks.OOP.Task10Shapes;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		char[][] circle = new char[radius * 2 + 2][radius * 2 + 2];
		int x;
		int y;
		for (int i = 0; i < circle.length; i++) {
			for (int j = 0; j < circle[i].length; j++) {
				x = i - radius;
				y = j - radius;
				if (x * x + y * y <= Math.pow(radius, 2)) {
					circle[i][j] = '0';
				} else {
					circle[i][j] = ' ';
				}
			}
		}
		for (char[] cs : circle) {
			for (char cs2 : cs) {
				System.out.print("" + cs2 + cs2);
			}
			System.out.println();
		}
		System.out.println(circle.length);
		System.out.println(circle[0].length);

	}
}
