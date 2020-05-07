package Keisho;

public class Dancer extends Character {
	public void danace() {
		System.out.println(this.name+"は情熱的に踊った");
	}
	
	public void attack (Matango m) {
		m.hp-=5;
		System.out.println(this.name+"の攻撃！");
		System.out.println("5のダメージ！");
		System.out.println("残りHP"+m.hp);
		
	}

}
