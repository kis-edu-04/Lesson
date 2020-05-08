package lesson;

import java.util.ArrayList;

public class Rental {
	ArrayList<Item> list = new ArrayList<Item>();

	public void add(Item item) {
		list.add(item);
		//item.days=100;
	}

	public void show() {
		for (Item item : list) {
			System.out.println(item);
		}
	}

	public int getGoukei() {
		int sum = 0;
		for (Item i : list) {
			sum += i.getPrice();
		}
		return sum;

	}

}
