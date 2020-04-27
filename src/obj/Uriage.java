package obj;

public class Uriage {
	int kosu;
	Shohin shohin;
	
	public void show() {
		System.out.println(this.shohin.name+"が"+this.kosu+"個売れた");
	}
	public void showUriage() {
		System.out.println("売り上げは"+this.kosu*this.shohin.price+"です");
	}

}
