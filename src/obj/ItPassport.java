package obj;

public class ItPassport extends Shiken {
	int tensu;

	public ItPassport() {
		super("ITパスポート");
	}

	public void showGoukaku() {

		if (this.tensu >= 70) {
			System.out.println("合格");

		} else {
			System.out.println("不合格");
		}
	}

}
