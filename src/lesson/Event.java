package lesson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {
	private String name;
	private Date hi;

	ArrayList<Sankasya> slist = new ArrayList<Sankasya>();

	public Event(String name) {
		this.name = name;
		this.hi= new Date();
//		String s= f2.format(d);
//		System.out.println(f2.format(hi));

	}

	public void add(Sankasya s) {
			slist.add(s);
	}

	public void show() {
			System.out.println(this.name);
			SimpleDateFormat f2= new SimpleDateFormat("yyyy年MM月dd日");
			System.out.println(f2.format(hi));
			for(Sankasya s:slist) {
				System.out.println(s.getName()+" "+s.getAge()+"歳");
			}
	}

}
