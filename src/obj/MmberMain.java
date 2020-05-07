package obj;

public class MmberMain {

	public static void main(String[] args) {
		Member m1 = new Member("山田", "0965835069");

		m1.show();

//		En e1 =new En(10);
//
//		e1.menseki();

		NetMember n1 =new NetMember("田中","03026589748","kjps@lks.jp");
		n1.show();
		
		System.out.println(m1);
		System.out.println(n1);
		
	}
	

}
