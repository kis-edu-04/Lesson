package Sukkiri;

public class Hero {
//基本的にフィールドはprivate
	private String name;
	private int hp ;
	private Sword sword;
	static int money=100;

//	コンストラクタ↓
	public Hero(String n) {
		this.hp=100;
		this.name=n;
	}

	public Hero() {
		this("ダミー");
	}
	public static void setRandomMoney() {
		Hero.money=(int)(Math.random()*1000);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}


	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("HPはマイナスにはできません");
			return;
		}
		this.hp=hp;
	}

	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sowrd) {
		this.sword=sword;
	}

}

//	public void attack (Matango m) {
//		m.hp-=this.sword.damage;
//		System.out.println(this.name+"の攻撃！");
//		System.out.println(this.sword.damage+"のダメージ！");
//		System.out.println("残りHP"+m.hp);
//
//
//		System.out.println("反撃を受けた");
//		this.hp-=2;
//		if(this.hp<=0) {
//			this.die();
//		}
//
//	}
//	 private void die() {
//		System.out.println(this.name+"は死亡しました");
//	}
//
//
//	public void sleep() {
//		this.hp=100;
//		System.out.println(this.name +"は眠って回復した！");
//	}
//	public void sit(int sec) {
//		this.hp +=sec;
//		System.out.println(this.name +"は"+sec+"秒座った");
//		System.out.println("HPが"+sec+"ポイント回復した");
//	}
//	public void slip() {
//		this.hp -= 5;
//		System.out.println(this.name +"は転んだ！");
//		System.out.println("5のダメージ");
//	}
//	public void run() {
//		System.out.println(this.name + "は逃げ出した！");
//		System.out.println("GAME OVER");
//		System.out.println("最終HPは"+this.hp+ "でした");
//
//	}
//}
