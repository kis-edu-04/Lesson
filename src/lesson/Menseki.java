package lesson;

public class Menseki {

	public static void main(String[] args) {
		enMenseki(10);
		
		for(int i=1;i<=5;i++) {
			enMenseki(i);
		}
		
		int [] hankei2 = {3,8,20};
			for(int h : hankei2) {
				enMenseki(h);
			}
	}
	
	
	public static void enMenseki (int hankei) {
		System.out.println(hankei*hankei*3.14);
		
	}
	
	

}
