package inheritance2;

public class EmailLogger extends Logger{

	@Override // Bu etiketi koymasak da olur fakat kod okunurluðu açýsýndan anlamý : Logger da log methodu olduðunu biliyorum ama ben
			  // kendi log methodumu yazarak o methodu eziyorum demek.
	public void log() {
		System.out.println("Email Yollandý!");
	}

}
