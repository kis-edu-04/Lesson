
package obj;



public class SeitoMain {
	
	public static void main(String[] args) {
	
	Seito s1=new Seito();
	s1.name="山川";
	s1.kokugo=90;
	s1.sansu =50;
	s1.syakai=60;
	
	s1.show();
	
	int n=s1.goukei();
	System.out.println(n);
	
	double n2=s1.heikin();
	System.out.println(n2);
	
	
	
	
	}		

}
