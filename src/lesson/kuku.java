package lesson;

public class kuku {

	public static void main(String[] args) {
		for(int i=1 ; i<=5;i++) {
			
			int x =new java.util.Random().nextInt(9)+1;
			int y =new java.util.Random().nextInt(9)+1;
			int coAnswer = x*y;
			System.out.println("回答を入力してください");
			System.out.println(x + "*" + y + "=");
			
	
	
			int answer = new java.util.Scanner(System.in).nextInt();
			if(answer== 0) 
				break;
			if (answer==x*y) {
				System.out.println("正解です");
			} else {
				System.out.println("不正解です回答は"+ coAnswer);
			}
		}
	}

}
