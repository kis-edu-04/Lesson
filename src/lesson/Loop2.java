package lesson;

public class Loop2 {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("こんにちは");
		}
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(i);
		}	
		System.out.println("数字を入力");
		int num =new java.util.Scanner(System.in).nextInt();
		 for(int i=1; i<num; i++) {
			 System.out.println(i);
		}
	    for(int i =2 ; i<=10 ; i=i+2) {
	    	System.out.println(i);
	    }
	    for(int i=1; i<=5 ;i++) {
	    	System.out.print(i);
	    	System.out.print(" ");
	    }
	}
		
}
	