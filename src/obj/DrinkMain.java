package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
		ArrayList<Drink> dlist = new ArrayList<Drink>();
		
		dlist.add(new Drink("コーラ",500));
		dlist.add(new Drink("サイダー",600));
		dlist.add(new Drink("緑茶",300));
		
		for(Drink d: dlist) {
			d.show();
		}
	}

}
