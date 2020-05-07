package obj;

public class KihonJohou extends Shiken {
	int gozen;
	int gogo;
	
	public  KihonJohou (int gozen,int gogo) {
		super("基本情報試験");
		this.gozen=gozen;
		this.gogo=gogo;
	}
	
	void showGoukaku() {
		if(this.gozen>=60 &&this.gogo>=60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
}
