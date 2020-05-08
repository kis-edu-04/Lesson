package obj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
		Date d=new Date();//現在日時
		System.out.println(d);
		System.out.println(d.getTime());
		Date d2=new Date(1500913327348L);
		System.out.println(d2);
		
		//基本こっち↓
		Calendar c=Calendar.getInstance();
		c.set(2016, 4, 9);
		Date c3 =c.getTime();
		System.out.println(c3);
		
		c.setTime(d);
		int year =c.get(Calendar.YEAR);
		int month =c.get(Calendar.MONTH)+1;
		int day =c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");

//		Calendar c2=Calendar.getInstance();
		c.set(2020, 6-1, 1);
		Date c4 =c.getTime();
		System.out.println(c4);
//		
//		SimpleDateFormat f= new SimpleDateFormat("yyyy年MM月dd日");
//		String s= f.format(c4);
//		System.out.println(s);
		

		SimpleDateFormat f2= new SimpleDateFormat("yyyy年MM月dd日");
//		String s= f2.format(d);
		System.out.println(f2.format(d));
		
		
	}
	

}
