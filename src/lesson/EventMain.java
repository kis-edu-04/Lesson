package lesson;

public class EventMain {

	public static void main(String[] args) {
		Event e =new Event("人狼大会");
		e.add(new Sankasya("田中",30));
		e.add(new Sankasya("山田",30));
		e.add(new Sankasya("山本",30));
		
		e.show();
		



	}

}
