package lesson;

public class RentalMain {

	public static void main(String[] args) {
//		ArrayList<Item> list=new ArrayList<Item>();
//		list.add(new Book("ジョジョの奇妙な冒険",1));
//		list.add(new CD("米津",1));
//		list.add(new CD("green apple",2));
//		
//		int sum=0;
//		for(Item i:list) {
//			System.out.println(i);
//			sum+=i.getPrice();
//		}
//		System.out.println("合計"+sum+"円");
		Rental r=new Rental();
		r.add(new Book("ジョジョの奇妙な冒険",1));
		r.add(new CD("米津",1));
		r.add(new CD("green apple",2));
		
		r.show();
		System.out.println(r.getGoukei());
		
		
		
	}

}
