package obj;

public class StrSample {

	public static void main(String[] args) {
		String s1="This is Java";
		String s2="java";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		if(s1.isEmpty()) {
			System.out.println("空文字です");
		}
		if(s1.contains("Java")){
			System.out.println("含まれています");
		}
		if(s1.startsWith("This")) {
			System.out.println("始まります");
		}
		System.out.println(s1.lastIndexOf("is"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0,4));
		
		System.out.println(s1.toLowerCase());//小文字
		System.out.println(s1.toUpperCase());//大文字
		System.out.println(s1.replace("Java","C++"));//文字列変換
		
		
		StringBuilder sb = new StringBuilder();//文字列をつなぎ合わせる(早い)
		
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");
		
		
		String s =sb.toString();
		System.out.println(s);
		
		s="Hello";
		s +="World";
		
		
				
	}

}
