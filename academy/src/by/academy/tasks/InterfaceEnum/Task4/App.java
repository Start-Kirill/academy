package by.academy.tasks.InterfaceEnum.Task4;

public class App {

	public static void main(String[] args) {
		Pants pants = new Pants(ClothesSizes.L, 125.12, "red");
		TShirt tShirt = new TShirt(ClothesSizes.M, 12.12, "blue");
		Skirt skirt = new Skirt(ClothesSizes.XS, 15.1, "orange");
		Tie tie = new Tie(ClothesSizes.XXS, 5.2, "black");
		Clothes[] clothes = {pants, tShirt, skirt, tie};
		
		Studio studio = new Studio();
		System.out.println("For women");
		studio.wearWomen(clothes);
		System.out.println("For men");
		studio.wearMan(clothes);
	}

}
