package DB;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;


public class DbSample {


	public static void main(String[] args) {

//		//すべて検索(shouhin)
//		ShouhinDAO dao = new ShouhinDAO();
//		ArrayList<Shouhin> list = dao.findAll();
//		for (Shouhin s : list) {
//			System.out.println(s.getSid()+s.getSname());
//		}
//		//一つだけ検索
//		Shouhin s =dao.findBySid(1);
//		System.out.println(s.getSname());
//		//追加
//		Shouhin s1 =new Shouhin(0,"バナナ",110);
//		dao.insert(s1);
//
//		//変更
//		Shouhin s2 =new Shouhin(4,"メロン",600);
//		dao.update(s2);
//
//		//削除
//		dao.delete(13);

		//すべて検索(uriage)
		UriageDAO udao =new UriageDAO();
		ArrayList<Uriage> ulist= udao.findAll();
		for(Uriage u: ulist) {
			System.out.println(u.getHi());
		}
		//一つだけ検索
		Uriage u =udao.findByUid(1);
		System.out.println(u.getHi());
		//sid検索
		int sid = new java.util.Scanner(System.in).nextInt();
		
		ArrayList<Uriage> ulist2 = udao.findBySid(sid);
		for(Uriage u2:ulist) {
			System.out.println(u2.getHi()+" "+u2.getKosu()+"個");
		}
		//追加
		Uriage u2=new Uriage(0,1,2,null);
		udao.insert(u2);
		//変更
		Calendar c =Calendar.getInstance();
		c.set(2020,4-1,1);;
		Date hi =new Date(c.getTimeInMillis());
		Uriage u3=new Uriage(5,3,2,hi);
		udao.insert(u3);
		
		//削除
		udao.delete(7);
		
			



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

//		UriageDAO udao =new UriageDAO();
//
//		ArrayList<Uriage> ulist =udao.findAll();
//		for(Uriage u :ulist) {
//			System.out.println(u.getKosu());
//		}
//
//		Uriage u =udao.findByUid(1);
//		System.out.println(u.getSid()+" "+u.getKosu()+" "+u.getHi());
//
//		udao.insert(new Uriage(0,13,3,null));
//		udao.insert(new Uriage(0,3,4,null));
//		udao.insert(new Uriage(0,7,10,null));
//		udao.insert(new Uriage(0,5,8,null));
//		udao.insert(new Uriage(0,6,4,null));
//		udao.insert(new Uriage(0,9,5,null));
//		udao.insert(new Uriage(0,10,8,null));
//



	}

}



