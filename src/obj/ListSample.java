package obj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListSample {

	public static void main(String[] args) {
//		String[] names= new String[3];
		List<String> names =new ArrayList<String>();

		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");

//		System.out.println(names.get(1));

		for(String n:names) {
			System.out.println(n);
		}

//		Sankaku s1= new Sankaku(10,5);
//		Sankaku s2= new Sankaku(15,4);
//		Sankaku s3= new Sankaku(8,9);

		ArrayList<Sankaku> slist=new ArrayList<Sankaku>();

		slist.add(new Sankaku(10,5));
		slist.add(new Sankaku(15,4));
		slist.add(new Sankaku(8,9));

		for(Sankaku s: slist) {
			s.menseki();
		}

		ArrayList<Integer> ilist=new ArrayList<Integer>();//int型の配列
		ilist.add(10);
		ilist.add(20);
		ilist.add(40);
		ilist.set(0, 50);
		System.out.println(ilist.get(2));
		System.out.println(ilist.size());
		ilist.remove(1);
		for(int i:ilist) {
			System.out.println(i);
		}

		List<String> llist =new LinkedList<>();
		llist.add("abc");
		llist.add("def");
		llist.add("ghi");
		for(String s : llist) {
			System.out.println(s);
		}




	}

}
