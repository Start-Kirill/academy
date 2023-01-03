package by.academy.tasks.OOP.Task10Shapes;

public abstract class Shape {
	
	protected String color;
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Shape(String color) {
		super();
		this.color = color;
	}


	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}


	public abstract void draw();
}
