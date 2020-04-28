package Keisho;

public class SuperHero extends Hero{

	public SuperHero () {
		super();
		System.out.println("SuperHeroのコンストラクタ");
	}

	boolean flying;

	public void fly() {
		this.flying =true;
		System.out.println("飛び上がった");

	}

	public void land() {
		this.flying =false;
		System.out.println("着地した");
	}

	public void run() {
		System.out.println(this.name + "撤退した");
	}

	public void attack (Matango m) {
		super.attack(m);
//		m.hp-=5;
//		System.out.println(this.name+"の攻撃！");
//		System.out.println("5のダメージ！");
//		System.out.println("残りHP"+m.hp);

		if(this.flying) {
			super.attack(m);
//				m.hp-=5;
//				System.out.println(this.name+"の攻撃！");
//				System.out.println("5のダメージ！");
//				System.out.println("残りHP"+m.hp);
		}

	}
}
