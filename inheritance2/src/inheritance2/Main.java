package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
//		EmailLogger emailLogger=new EmailLogger(); emailLogger'� da add yerine yazarsak olur ama kod fazlal��� olurdu! 
		
		customerManager.add(new DataBaseLogger()); //PolyMorhism mant��� ile art�k customerManager nas�l loglanmak istenirse kolayca de�i�tirilebilir. 
		
		

	}

}
