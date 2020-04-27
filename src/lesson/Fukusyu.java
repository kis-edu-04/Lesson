package lesson;

public class Fukusyu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		
		int sum = 0;
		for(int t : tensus) {
			sum += t;
		}
		System.out.println(sum);

	
	
		for(int t: tensus) {
			System.out.println(t);
		}
		int count =0;
		for (int t: tensus) {
			if(t>=70) {
				count++;
			}
		}
		System.out.println(count+"人");
	}	

}
