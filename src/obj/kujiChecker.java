package obj;

public class kujiChecker {
	
	int kingaku;
	
	
	public void check(kuji k) {
		if (k.bango==123456) {
			k.kekka="1等";
			kingaku +=100000;
		}if(k.bango%100==12) {
			k.kekka="2等";
			kingaku +=100;
		}else { k.kekka="はずれ";
		}
		
	}

}
