package lesson;

public class CD extends Item {

	public CD(String name, int days) {
		super(name, days);

	}

	public int getPrice() {
			return 300+(this.days-1)*100;
		
	}

}
