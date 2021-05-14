package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
	//müþteri ekleme kodlarý
	System.out.println("Müþteri Eklendi");
//	DataBaseLogger dataBaseLogger=new DataBaseLogger();Eðer bir kodun içerisinde baþka bir iþ yapan sýnýf new'leniyorsa o koddan hayýr gelmez!!
	//Altýn Kural:Bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa asla ve asla SOMUT SINIFTAN GÝDÝLMEZ!!
	//SOMUT SINIF:DataBaseLogger,FileLogger,EmailLogger,
	logger.log();	
	
	}
}
