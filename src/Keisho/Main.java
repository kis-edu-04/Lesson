package Keisho;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name="ミナト";
		h.hp=100;
		System.out.println(h);
		
		String s1="いあうえお";
		String s2="いあうえお";
		
		Hero h2 = new Hero();
		h2.name="みなと";
		h2.hp=100;
		System.out.println(h2);
		
//		Hero h3=h;
		
		if(h.equals(h2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
		
		//		Character sh =new SuperHero();
		//
//		Matango m1 = new Matango();
		//		Character c1=new Dancer();
		//		Character c2=new Hero();
//
//		ArrayList<Character> list = new ArrayList<Character>();
//		list.add(new SuperHero());
//		list.add(new Dancer());
//		list.add(new Hero());
//
//		for (Character ch : list) {
//			ch.attack(m1);
//
//		}
//
//		Character c = new SuperHero();
//		if (c instanceof SuperHero) {
//			SuperHero sh = (SuperHero) c;
//			sh.fly();
//		}
	}
}


//		c1.attack(m1);
//		sh.attack(m1);
//

//		Character c = new Character();
//		sh.fly();
//		sh.land();
//		sh.run();



//		Hero h = new Hero();
//
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//

//		Hero h =new Hero ();
//		h.run();
//
//		Matango m1= new Matango();
//		m1.hp=30;
//		m1.suffix='A';
//
//		sh.fly();
//		sh.attack(m1);
//

	


