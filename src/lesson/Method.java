package lesson;

public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します。");
		hello("さかえ");
		hello("栄");
		hello("sakae");
		System.out.println("終わりました。");
		keisan(89, 54);
		goukei(5);
		show("田中", 30);

		int x = 10;
		test(x);
		System.out.println(x);
		jijo(10);
		for (int i = 10; i <= 20; i++) {
			jijo(i);
		}

		String[] names = { "山元", "鈴木", "田中" };
		for (String n : names) {
			hello(n);
		}
		
		
		

	}

	public static void test (int x) {
		x =20;
	}
	

	public static void hello(String name) {
		System.out.println(name + "さんこんにちは…");
	}

	public static void keisan(int num1, int num2) {
		System.out.println(num1 + num2);

	}

	public static void goukei(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void show(String name, int age) {
		System.out.println(name + "さんは" + age + "歳です");
	}
	
	public static void jijo(int num) {
		int sum = num * num;

		System.out.println(sum);

	}
	
	

}
