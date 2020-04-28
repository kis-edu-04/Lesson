package obj;

public class Sankaku {
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
