package lesson;

public abstract class Item {
	String name;
	int days;
	
	public Item(String name,int days) {
		this.name=name;
		this.days=days;
	}

	public abstract int getPrice() ;

	@Override
	public String toString() {
		return this.name+" "+this.days+"日"+getPrice()+"円";
	}

}
