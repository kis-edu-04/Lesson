package lesson;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("さかえこうた");

		int tuki;
		tuki = 4;
		int hi;
		hi = 22;
		System.out.println(tuki + "月");
		System.out.println(hi + "日");
		System.out.println("今日は" + tuki + "月" + hi + "日だったような気がします");

		double p;
		p =3.14;
		System.out.println("円周率は" + p + "です");

		int a;
		a = 20;
		int b;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);

		System.out.println("今日は\"４月\"です");

		System.out.println("\\100");

		System.out.println("C:\\に\"フォルダ\"を作成");

		int num = 10;
		int amari = num%3 ;//１０で割ったあまり
		System.out.println(amari);

		num += + 5;
		num++;
		System.out.println(num);


		double d =3;
		int n =(int) 3.0;
		String s ="ベスト" + 3;
		System.out.println(s);

		int kokugo = 70;
		int sanasu =75;
		System.out.println((double)(kokugo + sanasu)/2 );

		int num1=3;
		int num2=5;
		System.out.println("足し算の結果は" + (num1+num2) );


		System.out.print("私は");
		System.out.print("私は");
		System.out.println("私は");


		int m = Math.max(10, 20);
		System.out.println(m);


		String age = "31";
		int nAge = Integer.parseInt(age);
		System.out.println(age +1);

		int r = new java.util.Random().nextInt(90);
		System.out.println(r);


		//サイコロ
		int saikoro = new java.util.Random().nextInt(6)+1;
		System.out.println("出目は"+  saikoro +"です");





	}

}
