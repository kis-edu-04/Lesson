package obj;

public class Chugakusei extends Seito {
	private int eigo;
	
	public  Chugakusei (String n,int koku,int san,int sya,int eigo) {
		super(n,koku,san,sya);
		this.eigo=eigo;
		
	}
	public int goukei() {
		return super.goukei()+this.eigo;
	
	
	}


}
