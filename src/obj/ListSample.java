package obj;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
//		String[] names= new String[3];
		ArrayList<String> names =new ArrayList<String>();
		
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

	}

}
