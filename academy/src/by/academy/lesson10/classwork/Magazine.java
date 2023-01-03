package by.academy.lesson10.classwork;

public class Magazine implements Printable {
	private String name;

	public Magazine() {
		super();
	}

	public Magazine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Magazine: " + name);
	}
	
	public static void printMagazine(Printable[] printable) {
		for(Printable p : printable) {
			if(p instanceof Magazine) {
				p.print();
			}
		}
	}

}
