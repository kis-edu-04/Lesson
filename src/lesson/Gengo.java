package lesson;

public class Gengo {

	public static void main(String[] args) {
		System.out.println("対応する元号番号を入力してください");
		System.out.println("1:昭和 2:平成 3:令和");
		int num =new java.util.Scanner(System.in).nextInt();
		System.out.println("年度を入力してください");
		int num2 =new java.util.Scanner(System.in).nextInt();
		
		String num3 =getGengoName(num);
		int num4 =getSeireki(num,num2);
		
		System.out.println(num3+num2+"年は西暦"+num4+"年");
			
	}
	
	public static int getSeireki(int gengou ,int nen) {
		if (gengou==3) {
			return 2018+nen;
		}if (gengou==2) {
			return 1988+nen;
		}if (gengou==1) {
			return 1925+nen;
		}return 0;
		
		
	}
	public static String getGengoName(int gengou) {
		if (gengou==1) {
			return "昭和";
		}if (gengou==2) {
			return "平成";
		}if (gengou==3) {
			return "令和";
		}return "エラー";
		
	}
	
	

}
