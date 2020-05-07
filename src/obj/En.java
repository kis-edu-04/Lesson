package obj;

public class En implements Zukei {
	@Override
	public String toString() {
		return "半径が"+r;
	}
	int r;
	
	public En (int r) {
		this.r=r;
	}
	
	public void menseki() {
		System.out.println("面積は"+r*r*3.14+"です");
	}
	public void enshu() {
		System.out.println("円周は"+2*3.14*r+"です");
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof En) {
			En e=(En)o;
			if (this.r ==(e.r)) {
				return true;
			}
		}
		return false;
	}
}
