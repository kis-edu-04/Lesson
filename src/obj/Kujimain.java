package obj;

public class Kujimain {

	public static void main(String[] args) {
		kuji k1 = new kuji();
		k1.bango=123456;
		
		kuji k2 = new kuji();
		k2.bango=123412;
		
		
		kuji k3 = new kuji();
		k3.bango=145689;
	
	kujiChecker c= new kujiChecker();
		c.check(k1);
		c.check(k2);
		c.check(k3);	
		
		k1.show();
		k2.show();
		k3.show();
		
	}
	

}
