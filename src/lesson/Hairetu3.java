

package lesson;

public class Hairetu3 {

	public static void main(String[] args) {
		int [] nums = {8,5,9,2,4};
		for(int n : nums) {
			System.out.println(n);
		}
		
		int sum = 0;
		for(int n : nums) {
			sum +=n;
		}
		System.out.println(sum);
		
		int count = 0;
		for(int n : nums) {
			if(n>=5) {
				count++;
			}
		}System.out.println(count);
		
		
		for(int i=0 ; i<nums.length; i++) {
			nums[i]=nums[i]*2;
		}
		
		int max=0;
		for(int n : nums) {
			max = Math.max(max, n);
		}
		System.out.println(max);
	}

}
