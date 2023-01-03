package by.academy.tasks.InterfaceEnum.Task4;

public class Studio {
	
	public void wearMan(Clothes[] clothes) {
		for (Clothes cloth : clothes) {
			if(cloth instanceof MenClothes) {
				System.out.println(cloth);
			}
		}
	}

	public void wearWomen(Clothes[] clothes) {
		for (Clothes cloth : clothes) {
			if(cloth instanceof WomenClothes) {
				System.out.println(cloth.getClass());
				System.out.println(cloth);
			}
		}
	}
}
