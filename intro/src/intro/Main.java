package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase

		// Don't repeat yourself

		String internetSubeButonu = "�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar D��t� Resmi!!");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Y�kseldi Resmi!!");
		} else {
			System.out.println("Dolar E�ittir Resmi!!");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		// Tek tek bunlar� ekrana yazd�rmak yerine Array[] kulland�k!!

		String[] krediler = {

				"H�zl� Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "�ift�i Kredisi", "MSB Kredisi", "MEB Kredisi",
				"K�lt�r Kredisi" };

		// forEach
		for (String kredi : krediler) {
			System.out.println(kredi);

		}
		// klasik For D�ng�s�
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int sayilar1[] = { 1, 2, 3, 4, 5 };
		int sayilar2[] = { 10, 20, 30, 40, 50 };

		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);

	}

}
