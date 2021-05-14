package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc=new SendikaCustomer(); // Bu Class'ý sonradan ekledik bu da Customer sýnýfýný inherit etti ve customerNumber kullanabildi.
		abc.customerNumber="999999";
	
		
		CustomerManager customerManager=new CustomerManager();
		
//		customerManager.add(hepsiBurada);
//		customerManager.add(engin);
//		customerManager.add(abc);
		
		Customer[] customers= {engin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
