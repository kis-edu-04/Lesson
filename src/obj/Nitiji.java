package obj;

public class Nitiji extends Hizuke{
	int ji;
	int hun;
	
	public Nitiji (int tuki,int hi,int ji,int hun) {
		super(tuki,hi);
		this.ji=ji;
		this.hun=hun;
	}
	
	public void Jikan() {
		System.out.println(ji+"時"+hun+"分");
	}
	public void show() {
		super.show();
		Jikan();
		
	}

}
