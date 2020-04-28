package obj;

public class KukuMondai {
	int num1;
	int num2;
	
	public KukuMondai() {
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	
	}
	public void show() {
		System.out.println(num1+"×"+num2);
		
	}
	public void check(int kotae) {
		if(num1*num2==kotae) {
			System.out.println("正解！！");
		}else {
			System.out.println("不正解…正解は"+num1*num2);
		}
	}
}
