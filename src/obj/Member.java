package obj;

public class Member {
	String name;
	String tel;
	
	public Member (String name ,String tel) {
		this.name = name;
		this.tel =tel;
	}
	
	public void show() {
		System.out.println(this.name+" "+this.tel);;
	}

	@Override
	public String toString() {
		return "名前は" + name + ",電話番号は" + tel  ;
	}
	

}
