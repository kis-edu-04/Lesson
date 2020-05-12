package DB;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = dao.findAll();
		for (Member m : list) {
			System.out.println(m.getMid()+" " + m.getName()+" " + m.getAdr());
		}

		Member m1 = dao.findByMid(1);
		System.out.println(m1.getMid()+" "+m1.getName()+" "+m1.getAdr());
	}

}
