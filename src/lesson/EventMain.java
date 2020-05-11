package lesson;

public class EventMain {

	public static void main(String[] args) {
		Event e =new Event("人狼大会");
		
		try {
			e.add(new Sankasya("",30));
			e.add(new Sankasya("山田",-1));
			e.add(new Sankasya("山本",30));
		}catch(SankasyaException ex)	{
			System.out.println("エラー:"+ex.getMessage());
		}
		
		e.show();
		
	}

}
