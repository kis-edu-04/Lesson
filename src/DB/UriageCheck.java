package DB;

import java.util.ArrayList;

public class UriageCheck {

	public static void main(String[] args) {

		ShouhinDAO dao = new ShouhinDAO();
		ArrayList<Shouhin> list = dao.findAll();
		for (Shouhin s : list) {
			System.out.println(s.getSid()+s.getSname());
		}
			System.out.println("どの売り上げを見たいですか？");
			int num = new java.util.Scanner(System.in).nextInt();

			UriageDAO udao = new UriageDAO();

			ArrayList<Uriage> ulist = udao.findBySid(num);
			for(Uriage u:ulist) {
				System.out.println(u.getHi()+" "+u.getKosu()+"個");
			}

	}
}
