package obj;

import java.util.ArrayList;

public class ZukeiMain {

	public static void main(String[] args) {
		En e1=new En(10);
		En e2=new En(11);
		if(e1.equals(e2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
		
//
//		Zukei s1 = new Shikaku(10, 5);
//		s1.menseki();
//
//		Zukei s2 = new En(8);
//		s2.menseki();
//
//		Zukei s3 = new Sankaku(6, 8);
//		s3.menseki();

		ArrayList<Zukei> list = new ArrayList<Zukei>();
		list.add(new Shikaku(10,9));
		list.add(new En(8));
		list.add(new Sankaku(3,9));
		
			for(Zukei z:list) {
//				z.menseki();
				System.out.println(z);
				if(z instanceof En) {
					En en =(En)z;
					en.enshu();
				}
			}
	}

}
