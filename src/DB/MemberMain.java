package DB;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = dao.findAll();
		for (Member m : list) {
			System.out.println(m.getMid()+" " + m.getName()+" " + m.getAdr());
		}
		
		System.out.println("どの住所を見たいですか？IDを入力してください");
		int mid =new java.util.Scanner(System.in).nextInt();
		
		Member m1 = dao.findByMid(mid);
		System.out.println(m1.getAdr());
	}

}
