package lesson;

public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します。");
		hello("さかえ");
		hello("栄");
		hello("sakae");
		System.out.println("終わりました。");
		//		int kotae =keisan(89, 54);
		System.out.println(keisan(89, 54));
		int kotae2 = goukei(10);
		System.out.println(kotae2);
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

		boolean n = isGuusu(10);
		if (n) {
			System.out.println("偶数");
		} else
			System.out.println("奇数");
		
		String t =getTimeName(56);
			System.out.println(t);
		
			int[] nums = { 5, 8, 9, 2 };

			printarray(nums);
			
			String data = "apple,orange,lemon";
			String[] fruitu =data.split(",");
			System.out.println(fruitu[0]);
			System.out.println(fruitu[1]);
			System.out.println(fruitu[2]);
			
			
		System.out.println(getlast(nums));	
	}

	public static void test(int x) {
		x = 20;
	}

	public static void hello(String name) {
		System.out.println(name + "さんこんにちは…");
	}

	public static int keisan(int num1, int num2) {
		return num1 + num2;

	}

	public static int goukei(int num) {

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static void show(String name, int age) {
		System.out.println(name + "さんは" + age + "歳です");
	}

	public static void jijo(int num) {
		int sum = num * num;

		System.out.println(sum);

	}

	public static boolean isGuusu(int num) {
//		return (num%2==0);
		
		if (num % 2 == 0) {
			return true;

		} else 
			return false;
	}
	
	public static String getTimeName(int hour) {
		if (hour<=12){
			return "午前";
		}
		if (hour<=24) {
			return "午後";
		}	
			return "エラー";
	}
	
	public static void printarray(int[] array) {
		for (int num : array) {
			System.out.println(num);
		}
	}
	
	public static int getlast (int[] array) {
		return array[array.length -1];
		
	}
	

}
