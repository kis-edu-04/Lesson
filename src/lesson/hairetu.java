package lesson;

public class hairetu {

	public static void main(String[] args) {
		int[] scores = new int[5];

		scores[0]=20;
		System.out.println(scores.length);
		String str = "あいう";
		System.out.println(str.length());
//
//		System.out.println(scores[0]);
//
//		int[] prices = {100,200,150};
//
//		System.out.println(prices[0]);
//		System.out.println(prices[1]);
//		System.out.println(prices[2]);
//		System.out.println(prices.length);
//
//		for(int i=0; i<3 ; i++) {
//			System.out.println(prices[i]);
//		}
//
//
		String[] names = {"コーラ","コーヒー","水"};
        
		for(int i=0 ; i<3 ; i++) {
			System.out.println(names[i]);
		}
		int[] points= {80,90,60,70,84,34};
		int sum = 0;
		for(int i=0; i<points.length ; i++) {
			sum +=points[i];
		}
		System.out.println(sum);
		
		
		int [] seq = {0,1,2,3,0,1,3,2};
		
		for(int i=0;i<seq.length ;i++) {
			char[] base = {'A','T','G','C'};
			System.out.println(base[seq[i]]);
		}
		
		
		
		
	}

}
