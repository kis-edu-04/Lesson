package lesson;

public class CD extends Item {

	public CD(String name, int days) {
		super(name, days);

	}

	public int getPrice() {
		if (this.days <= 1) {
			return 300;
		} else {
			return 300+(this.days-1)*100;
		}
	}

}
