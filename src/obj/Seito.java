package obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int syakai;


	public void show() {
	System.out.println(name+" "+"国語"+kokugo+"点"+" "+"算数"+sansu+"点"+" "+"社会"+syakai+"点");
	}


	public int goukei() {
		return kokugo+sansu+syakai;


	}

	public double heikin() {
		return (kokugo+sansu+syakai)/3.0;




	}

}
