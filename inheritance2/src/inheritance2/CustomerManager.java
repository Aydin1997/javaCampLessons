package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
	//m��teri ekleme kodlar�
	System.out.println("M��teri Eklendi");
//	DataBaseLogger dataBaseLogger=new DataBaseLogger();E�er bir kodun i�erisinde ba�ka bir i� yapan s�n�f new'leniyorsa o koddan hay�r gelmez!!
	//Alt�n Kural:Bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa asla ve asla SOMUT SINIFTAN G�D�LMEZ!!
	//SOMUT SINIF:DataBaseLogger,FileLogger,EmailLogger,
	logger.log();	
	
	}
}
