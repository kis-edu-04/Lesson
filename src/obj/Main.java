package obj;

public class Main {

	private static final Shohin Shohin = null;

	public static void main(String[] args) {
		Sankaku m = new Sankaku();
//		m.takasa =6;
//		m.teihen =9;
		
		m.menseki();
		
		Shohin s = new Shohin ("りんご",100);
//		s.name= "りんご";
//		s.price =100;
//		
		s.show();	
		s.showTax();
		
		Shohin s2 = new Shohin("みかん",150);
//		s2.name = "みかん";
//		s2.price = 150;
		
		Book b2=new Book("それから",500,"夏目漱石");
		
		
		
		Uriage u = new Uriage();
		u.kosu=7;
		u.shohin= b2;
		u.show();
		u.showUriage();
		
		
		Book b=new Book("魚図鑑",5000,"さかな博士");
		b.show();
		
		
		
		Uriage u2 = new Uriage();
		u2.kosu = 3;
		u2.shohin = s2;
		u2.show();
		u2.showUriage();		
		
//		En e = new En();
//		e.r=10;
//		
//		System.out.println("半径"+e.r+"の");
//		e.menseki();
//		e.enshu();
		
		DenssiMoney d = new DenssiMoney();
		
		
		d.kingaku =0;
		d.point=0;
		
		d.charge(600);
		d.buy(500);
		
		d.change();
		
		
//		Hizuke h1=new Hizuke();
//		h1.tuki =4;
//		h1.hi=27;
//		h1.show();
//		
//		Hizuke h2=new Hizuke();
//		h2.tuki =5;
//		h2.hi=7;
//		h2.show();
//		
//		Nitiji n = new Nitiji();
//		n.tuki=5;
//		n.hi=28;
//		n.ji=3;
//		n.hun=26;
		
		Nitiji n = new Nitiji(4,28,15,6);
		
//		n.Jikan();
		n.show();
		
		
	}

}
