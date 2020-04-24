package lesson;

public class Menseki {

	public static void main(String[] args) {
		double kotae = enMenseki(10);
		System.out.println(kotae);

		System.out.println();//

		for (int i = 1; i <= 5; i++) {
			System.out.println(enMenseki(i));
		}

		System.out.println();//

		int[] hankei2 = { 3, 8, 20 };
		for (int h : hankei2) {
			double kotae2 = enMenseki(h);
			System.out.println(kotae2);
		}

		System.out.println();//
		//int deruta = sankakumenseki(8,9);
		System.out.println(sankakumenseki(8, 9));

	}

	public static double enMenseki(int hankei) {
		return (hankei * hankei * 3.14);

	}

	public static int sankakumenseki(int u, int h) {
		return ((u * h) / 2);
	}

}
