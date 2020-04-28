package obj;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> kulist =new ArrayList<KukuMondai>();
			kulist.add(new KukuMondai());
			kulist.add(new KukuMondai());
			kulist.add(new KukuMondai());
			kulist.add(new KukuMondai());
			kulist.add(new KukuMondai());
			
		
		for(KukuMondai k :kulist) {
			k.show();
			int kotae =new java.util.Scanner(System.in).nextInt();
			k.check(kotae);
		}

	}

}
