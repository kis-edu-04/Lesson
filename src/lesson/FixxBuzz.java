package lesson;

public class FixxBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {
			String g = getFizzBuzz(i);
			System.out.println(g);

			//			if(i%15==0) {
			//				System.out.println("FizzBuzz");
			//		}else if(i%3==0) {
			//				System.out.println("Fizz");
			//		}else if(i%5==0) {
			//				System.out.println("Buzz");
			//		}else System.out.println(i);	
		}
	}

	public static String getFizzBuzz(int num) {

		if (num % 15 == 0) {
			return 	"FizzBuzz";		//System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			return 	"Fizz";				//System.out.println("Fizz");
		} else if (num % 5 == 0) {
			return 	"Buzz";					//System.out.println("Buzz");
		} else
			return num+"";
	}
	
	
}
