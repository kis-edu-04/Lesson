package obj;

public class Sankaku implements Zukei{
	@Override
	public String toString() {
		return "底辺が"+teihen+"高さが"+takasa;
	}

	private int teihen;
	private int takasa;
	
	public int getTeihen() {
		return this.teihen;
	}
	public int getTakasa() {
		return this.takasa;
	}
	
	public void setTeihen(int teihen) {
		this.teihen=teihen;
	}
	public void setTakasa(int takasa) {
		this.takasa=takasa;
	}

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
