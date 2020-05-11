package obj;

import java.util.ArrayList;
import java.util.InputMismatchException;

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
			try {
			int kotae =new java.util.Scanner(System.in).nextInt();
			k.check(kotae);
			}catch(InputMismatchException e){
				System.out.println("数字を入力してください");
			}
			
		}

	}

}
