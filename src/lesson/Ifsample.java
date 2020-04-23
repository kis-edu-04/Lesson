package lesson;

public class Ifsample {

	public static void main(String[] args) {
		//入力した数が10なら当たりそうでなければ外れ
		//System.out.println("番号を入力:");
//		int a = new java.util.Scanner(System.in).nextInt();
//		//８０、A,60,b other c
//		switch(a) {
//		case 1:
//			System.out.println("コーラ");
//			break;
//		case 2:
//		case 4:	
//			System.out.println("コーヒー");
//			break;
//		case 3:
//			System.out.println("水");
//			break;
//		default:
//			System.out.println("番号が違います");
			
//		}
		System.out.println("月を入力してください");
		int month =new java.util.Scanner(System.in).nextInt();
		
		switch(month) {
		case 2:
			System.out.println(29+"日");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30+"日");
			break;
		default:
			System.out.println("31日");
		}
	}

}
