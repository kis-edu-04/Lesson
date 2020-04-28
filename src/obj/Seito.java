package obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int syakai;
	
	public Seito (String n,int koku,int san,int sya) {
		this.name=n;
		this.kokugo=koku;
		this.sansu= san;
		this.syakai=sya;
		
	}


	public void show() {
	System.out.println(name+" "+"国語"+kokugo+"点"+" "+"算数"+sansu+"点"+" "+"社会"+syakai+"点");
	}


	public int goukei() {
		return kokugo+sansu+syakai;


	}

	public double heikin() {
		return this.goukei()/3.0;




	}

}
