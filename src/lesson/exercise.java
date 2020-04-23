package lesson;

public class exercise {

	public static void main(String[] args) {

//		int a = 3;
//		int b = 5;
//		int c = a*b;
//
//		System.out.println("縦幅"+ a + "横幅" + b + "の長方形の面積は、"+ c);
//
//
//		boolean result = true;
//		char name = '駆';
//		int num1 = 3;
//		long num2 = 314159265853979L;
//		String word ="ミナトの攻撃！敵に15ポイントのダメージを与えた。";
//
//		System.out.println(num1);

		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("貴方の年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の"+ name +"さん、あなたの運気番号は"+ fortune+"です！");
		System.out.println("1:大吉 2:中吉 3:小吉 4:凶");



	}			

}
