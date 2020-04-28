package obj;

public class Teacher {
	String name;
	int nen;
	int kumi;
	
	public Teacher(String n,int n2,int k) {
		this.name=n;
		this.nen=n2;
		this.kumi=k;
	}
	
	public void show () {
		if((6>=nen &&nen>0)&&(kumi>0&&4>=kumi)) {
			System.out.println(name + " "+ nen+"年"+kumi+"組");
			
		}else {
			System.out.println("担任無し");
		}
	}

	public Teacher(String n) {
		this(n,0,0);
	}

}
