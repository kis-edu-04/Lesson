package obj;

public class Sankaku implements Zukei{
	@Override
	public String toString() {
		return "底辺が"+teihen+"高さが"+takasa;
	}

	int teihen;
	int takasa;

	//	public Sankaku(int takasa, int teihen) {
	//		this.teihen=teihen;
	//		this.takasa=takasa;
	//	}

	public void menseki() {
		System.out.println(this.teihen * this.takasa / 2);
	}

	public Sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}
	
	public Sankaku() {
		this(10,10);

	}

}
