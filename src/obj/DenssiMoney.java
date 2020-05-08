package obj;

public class DenssiMoney {
	private int kingaku;
	private int point;

	public int getKingaku() {
		return kingaku;
	}

	public int getPoint() {
		return point;
	}

	public void charge(int m) {
		kingaku += m;
		System.out.println("ただ今のチャージ残高は" + kingaku + "円です");
	}

	public void buy(int m) {
		if (this.kingaku - m < 0) {
			System.out.println("残額が足りません");
		} else {
			this.kingaku -= m;
			this.point += 0.05 * m;
			System.out.println("現在のポイントは" + point + "ポイントです");

		}
	}
	
	public void change() {
		this.kingaku+=this.point;
		this.point=0;
		System.out.println("現在の金額は"+(this.kingaku)+"円"  +this.point+"ポイントです");
	}
	

}
