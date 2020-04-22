package lesson;

public class kuku {

	public static void main(String[] args) {
		int a =new java.util.Random().nextInt(9)+1;
		int b =new java.util.Random().nextInt(9)+1;

		System.out.println("回答を入力してください");
		System.out.print(a);
		System.out.print("*");
		System.out.print(b);
		System.out.println("=");


		int num = new java.util.Scanner(System.in).nextInt();
		if (num==a*b) {
			System.out.println("正解です");
		} else {
			System.out.println("不正解です");
		}
	}

}
