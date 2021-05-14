package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) { 
		
		// add methodunu override yaparak her Customer i�in yazabilirdik 
		//fakat Customer s�n�f�n� kullanarak Polymorhism yapt�k ve t�m inherit eden class'lar o �zelli�e ula�abildi.
		
		System.out.println(customer.customerNumber +" kaydedildi.");
		
		
		// Normalde customerNumber �zelli�i Customer class'�nda fakat customerNumber extends edildi�i i�in art�k 
		// IndividualCustomer ve CorporateCustomer da kullanabiliyor.
		}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer); // veya System.out.println(customer.customerNumber +" kaydedildi."); yaz�labilirdi!
		}
	}
}

// SOLID=Open Closed Participle : Sisteme yeni �zellik eklendi�inde mevcut da bulunan hi� bir kod de�i�tirilmez!!







