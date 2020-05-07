package lesson;

public class CD extends Item {

	public CD(String name, int days) {
		super(name, days);

	}

	public int getPrice() {
		if (this.days <= 1) {
			return this.days * 200;
		} else {
			return this.days * 100;
		}
	}

}
