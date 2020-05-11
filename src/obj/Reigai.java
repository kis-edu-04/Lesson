package obj;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {

	public static void main(String[] args) throws IOException {
//		try {
//			int num =3/0;
//		}catch(ArithmeticException e) {
//			System.out.println("エラーです");
//		}
//

//		try(FileWriter fw =new FileWriter("data.txt");){
//			fw.write("hello!");

//		int num =3/0;
//		String s =null;
//		s.isEmpty();

//		}catch(IOException e) {
//			System.out.println("エラー:"+e.getMessage());  //catch基本型
////			e.printStackTrace();
//		}catch(NullPointerException e) {
//			System.out.println("NULLです");
//		}finally {
//			if(fw != null) {
//			try {
//				fw.close();
//			}catch(IOException e) {
//
//			}
//
//		}
		sub();
	}
	public static void sub() throws IOException {
		
		subsub();
		
	}
	public static void subsub()throws IOException {
		FileWriter fw =new FileWriter("data.txt");
	}


}
