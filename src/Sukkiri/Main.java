package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
//		Hero.money=1000;
		System.out.println(Hero.money);

		Sword s = new Sword("氷の剣",10);
//		s.name = "炎の剣";
//		s.damage =10;


		Hero h = new Hero("ミナト");
		h.setName("田中");
		Hero h2 = new Hero("ヤマダ");
		Hero.money=500;
		
		System.out.println(Hero.money);
		
		
		h.setSword(s);
		System.out.println("勇者" + h.getName() + "を生み出しました");
		System.out.println("現在の武器は"+h.getSword().getName());

		h.setHp(-100);
		System.out.println(h.getHp());
//		h.die();

//		Wizard w =new Wizard();
//		w.name = "スガワラ";
//		w.hp =50;
//		w.heal(h);
//
//
////		Hero h2;
////		h2 =h;
////		h2.hp =200;
////		System.out.println(h.hp);
//
//
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();
//		h.attack(m1);

	}

}
