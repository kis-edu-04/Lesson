
package obj;

import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {

//	Seito s1=new Seito();
//	s1.name="山川";
//	s1.kokugo=90;
//	s1.sansu =50;
//	s1.syakai=60;
//
//	s1.show();
//
//	int n=s1.goukei();
//	System.out.println(n);
//
//	double n2=s1.heikin();
//	System.out.println(n2);
//
//	Teacher t=new Teacher("平坂");
//	t.show();
//
//	Teacher t2=new Teacher("本田",5,4);
////	t2.name="ごとう";
////	t2.nen=9;
////	t2.kumi=2;
//
//	t2.show();

	ArrayList<Chugakusei> clist=new ArrayList<Chugakusei>();
		clist.add(new Chugakusei("田中",56,30,80,68));
		clist.add(new Chugakusei("山田",82,56,70,51));
		clist.add(new Chugakusei("田中",69,72,38,90));
		
		int sum =0;
		
		for (Chugakusei c :clist) {
			sum +=c.goukei();
		}
		
		System.out.println("合計点は"+sum+"点です。");
		



	}

}
