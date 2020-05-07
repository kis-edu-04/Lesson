package Keisho;

public class Hero extends Character{
	
	
	public  Hero () {
		
	}
	
	public Hero (String name) {
		this.name=name;
		System.out.println("Heroのコンストラクタ");
	}

	public void attack (Matango m) {
		m.hp-=5;
		System.out.println(this.name+"の攻撃！");
		System.out.println("5のダメージ！");
		System.out.println("残りHP"+m.hp);
	}
	public String toString() {
		return "名前"+this.name+"HP"+this.hp;
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h=(Hero)o;
			if (this.name .equals(h.name)) {
				return true;
			}
		}
		return false;
	}
		
}
