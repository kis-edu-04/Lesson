package lesson;

public class Hairetu2 {
		
	public static void showKion(double kion) {
		System.out.println(kion +"度");
	}
	
	
	
	public static void main(String[] args) {
		double [] temp = {15.5,20.1,18.3};
			for(double t : temp) {
				showKion(t);
			}
		

		
		
		
//		int [] data= {5,8,7,9,6};
//		for(int d : data) {
//			System.out.println(d);
//		}
//		
//		
//		int[] prices = {100,200,150};
//
//		for(int i=0; i<3 ; i++) {
//			int value = prices[i];
//			System.out.println(prices[i]);
//		}	
//
//		for (int value : prices ) {
//			System.out.println(value);
//		}

		String[] names = {"コーラ","コーヒー","水"};

		for(String n :names) {
			System.out.println(n + "は"+ n.length() +"文字");
		}
		
		
		int[] points= {80,90,60,70,84,34};
		int sum = 0;
		for(int p : points) {
			sum+=p;
		}
		System.out.println(sum);
		
		
		int count=0;
		for(int p : points) {
			if(p>=70) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
