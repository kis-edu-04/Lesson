package lesson;

public class Ifsample {

	public static void main(String[] args) {
		//入力した数が10なら当たりそうでなければ外れ
		System.out.println("点数を入力してください");
		int a = new java.util.Scanner(System.in).nextInt();
		//８０、A,60,b other c
		if (a>=80) {
			System.out.println("A評価です");
		} else if (a>=60 && a<80){
			System.out.println("B評価です");
		} else {	
			System.out.println("C評価です");
		}
	}

}
