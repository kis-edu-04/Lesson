package DB;

import java.util.ArrayList;

public class DbSample {


	public static void main(String[] args) {


//		ShouhinDAO dao =new ShouhinDAO();
//		dao.findBySid(5);
//		dao.update(6, "なし", 200);
//		dao.findAll();
//		Shouhin s = new Shouhin (0,"バナナ",110);
//		dao.update(s);
//		dao.insert(s);
//		dao.findAll();

//
//		dao.delete(11);
//
//		ArrayList<Shouhin> list =dao.findAll();
//		for(Shouhin s:list) {
//			System.out.println(s.getSname());
//		}

		UriageDAO udao =new UriageDAO();

		ArrayList<Uriage> ulist =udao.findAll();
		for(Uriage u :ulist) {
			System.out.println(u.getKosu());
		}

		Uriage u =udao.findByUid(1);
		System.out.println(u.getSid()+" "+u.getKosu()+" "+u.getHi());

		udao.insert(new Uriage(0,13,3,null));
		udao.insert(new Uriage(0,3,4,null));
		udao.insert(new Uriage(0,7,10,null));
		udao.insert(new Uriage(0,5,8,null));
		udao.insert(new Uriage(0,6,4,null));
		udao.insert(new Uriage(0,9,5,null));
		udao.insert(new Uriage(0,10,8,null));
		



	}

}



