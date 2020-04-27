package obj;

public class Shohin {
	String name;
	int price ;
	
	public void show() {
		System.out.println(this.name+"は"+this.price+"円です");
	
	
	}
	public void showTax() {
		System.out.println("消費税は"+this.price*0.1+"円です");
		
		
	}
	

}
