package inheritance2;

public class EmailLogger extends Logger{

	@Override // Bu etiketi koymasak da olur fakat kod okunurlu�u a��s�ndan anlam� : Logger da log methodu oldu�unu biliyorum ama ben
			  // kendi log methodumu yazarak o methodu eziyorum demek.
	public void log() {
		System.out.println("Email Yolland�!");
	}

}
