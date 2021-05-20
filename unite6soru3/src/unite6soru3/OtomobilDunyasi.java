package unite6soru3;

class Otomobil {
	public String BenNeyim = "Otomobil";
    public void islem() {}
}

class SUV extends Otomobil {
	public SUV () {
		BenNeyim = "SUV class";
	}
	public void islem() {
		System.out.println("SUV calisiyor");
	}
}

class Comfort extends Otomobil {
	public Comfort() {
		BenNeyim = "Comfort class";
	}
	
	public void islem() {
		System.out.println("Comfort calisiyor");
	}
}

class Premium extends Otomobil {
	public Premium() {
		BenNeyim = "Premium class";
	}
	
	public void islem() {
		System.out.println("Premium calisiyor");
	}
}

class Sport extends Otomobil {
	public Sport() {
		BenNeyim = "Sport class";
	}
}

class BMW extends Sport {

	public BMW() {
		BenNeyim = "BMW Otomobili";
	}
	public void Analiz() {
		System.out.println("Alman yapimi superspor otomobiller");
	}
	
}

class Mercedes extends Premium{
	public Mercedes() {
		BenNeyim = "Mercedes Otomobili";
	}
	public void Analiz() {
		System.out.println("Alman yapimi premium otomobiller");
	}
}

public class OtomobilDunyasi {

	public void OtomobilBaslat(Otomobil[] o) {
		for (int i = 0 ; i < o.length ; i++ ) {
			o[i].islem(); 	//Dikkat!
		}
		
	}
	
	public static void main(String[] args) {
		Otomobil o[] = new Otomobil[7];
		o [0] = new Otomobil();   
		o [1] = new BMW(); // Gec baglama ve polimorfizm (Otomobil tipi BMW'ye baglandi goruldugu gibi
		o [2] = new Mercedes(); // - // Gec baglama ve polimorfizm (Otomobil tipi Mercedes'e baglandi goruldugu gibi
		o [3] = new Premium(); //- Gec baglama ve polimorfizm (Otomobil tipi Premium'a baglandi goruldugu gibi
		o [4] = new Comfort(); // - Gec baglama ve polimorfizm (Otomobil tipi Comfort'a baglandi goruldugu gibi
		o [5] = new Sport(); // Gec baglama ve polimorfizm (Otomobil tipi Sport'a baglandi goruldugu gibi
		o [6] = new SUV(); // -  Gec baglama ve polimorfizm (Otomobil tipi SUV'ye baglandi goruldugu gibi
		
		OtomobilDunyasi o1 = new OtomobilDunyasi();
		o1.OtomobilBaslat(o);
		/*eger OtomobilBaslat metodu static olsaydý
		 * OtomobilBaslat(o) Yazarkta çalýþtýrabilirdik static ve static olmayan farkýný burada da görebiliriz.
		 */
		
		/* Geniþletilebilirik sayesinde Sýnýflarý c oðaltarak türeterek genisletilebilir ayrýca islem() yordamý cagirilirken ek bir yuk ustlenilmedi.Polimorfizm ve gec baglama sayesinde bu isler kendiliginden gerceklesti
		
		*/
	}
}
