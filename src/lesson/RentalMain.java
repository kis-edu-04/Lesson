package lesson;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {
		ArrayList<Item> list=new ArrayList<Item>();
		list.add(new Book("ジョジョの奇妙な冒険",1));
		list.add(new CD("米津",1));
		list.add(new CD("green apple",3));
		
		int sum=0;
		for(Item i:list) {
			System.out.println(i);
			sum+=i.getPrice();
		}
		System.out.println("合計"+sum+"円");
	}

}
