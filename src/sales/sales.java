package sales;

public class sales {
	private String name;
	private int kingaku;
	
	public sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKingaku() {
		return kingaku;
	}

	public void setKingaku(int kingaku) {
		this.kingaku = kingaku;
	}
	int souryou=0;
	public int getSouryou() {
		if (kingaku<3000) {
			 souryou +=500;
		}
		return souryou;
	}
	public int getTotal() {
		return kingaku+souryou;
	}

	@Override
	public String toString() {
		return this.name+" "+kingaku+"円 送料"+souryou+"円";
	}
	
	
	


}
