package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) { 
		
		// add methodunu override yaparak her Customer için yazabilirdik 
		//fakat Customer sýnýfýný kullanarak Polymorhism yaptýk ve tüm inherit eden class'lar o özelliðe ulaþabildi.
		
		System.out.println(customer.customerNumber +" kaydedildi.");
		
		
		// Normalde customerNumber özelliði Customer class'ýnda fakat customerNumber extends edildiði için artýk 
		// IndividualCustomer ve CorporateCustomer da kullanabiliyor.
		}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer); // veya System.out.println(customer.customerNumber +" kaydedildi."); yazýlabilirdi!
		}
	}
}

// SOLID=Open Closed Participle : Sisteme yeni özellik eklendiðinde mevcut da bulunan hiç bir kod deðiþtirilmez!!







