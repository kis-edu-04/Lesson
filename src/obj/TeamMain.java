package obj;

public class TeamMain {

	public static void main(String[] args) {
		Team t=new Team("ロアッソ熊本",5,2);
		Team t2=new Team();
		
		System.out.println(t);
		System.out.println(t.getName() + t.getWin() + "勝" + t.getLose() + "敗");
	}

}
