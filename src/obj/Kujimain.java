package obj;

import java.util.ArrayList;

public class Kujimain {

	public static void main(String[] args) {
		ArrayList<kuji> klist = new ArrayList<kuji>();

		klist.add(new kuji(123456));
		klist.add(new kuji(123412));
		klist.add(new kuji(145689));

		//		kuji k1 = new kuji(123456);
		//		kuji k2 = new kuji(123412);
		//		kuji k3 = new kuji(145689);

		kujiChecker c = new kujiChecker();
		for (kuji k : klist) {
			c.check(k);
			k.show();

		}

		//		c.check(k1);
		//		c.check(k2);
		//		c.check(k3);
		//
		//		k1.show();
		//		k2.show();
		//		k3.show();

		System.out.println(c.kingaku);

	}

}
