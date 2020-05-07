package obj;

public class NetMember extends Member {
	String mail;

	public NetMember (String name,String tel,String mail ) {
		super (name,tel);
		this.mail=mail;
	}

	public void show() {
		super.show();
		System.out.println(this.mail);
	}

	@Override
	public String toString() {
		return super.toString()+"メールは"+mail;
	}

}
