package obj;

public class Shikaku implements Zukei{
	int haba;
	int takasa;
	
	public Shikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki () {
		System.out.println("面積は"+this.haba*this.takasa+"です");
	}

	@Override
	public String toString() {
		return "幅が"+haba+"高さが"+takasa;
	}

}
