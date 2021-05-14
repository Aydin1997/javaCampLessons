package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
//		EmailLogger emailLogger=new EmailLogger(); emailLogger'ý da add yerine yazarsak olur ama kod fazlalýðý olurdu! 
		
		customerManager.add(new DataBaseLogger()); //PolyMorhism mantýðý ile artýk customerManager nasýl loglanmak istenirse kolayca deðiþtirilebilir. 
		
		

	}

}
