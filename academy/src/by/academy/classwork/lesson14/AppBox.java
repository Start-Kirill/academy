package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.Iterator;

public class AppBox {

	public static void main(String[] args) {
		ArrayList<HeavyBox> box = new ArrayList<>();

		HeavyBox box1 = new HeavyBox(2, 5, 6, 8);
		HeavyBox box2 = new HeavyBox(7, 3, 1, 9);
		HeavyBox box3 = new HeavyBox(5, 1, 4, 2);

		box.add(box1);
		box.add(box2);
		box.add(box3);

		for (HeavyBox heavyBox : box) {
			System.out.println(heavyBox);
		}

		box.get(0).weight += 1;

//		box.remove(2);

		for (HeavyBox heavyBox : box) {
			System.out.println(heavyBox);
		}

		HeavyBox[] boxArray = box.toArray(new HeavyBox[0]);

//		HeavyBox[] boxArray2 = (HeavyBox[]) box.toArray();

		box.set(1, null);

		Iterator<HeavyBox> iter = box.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
