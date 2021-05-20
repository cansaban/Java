package unite5soru10;
/*Kompozisyon daha onceden yazilmis siniflarin ozelliklerini kullanmak için temiz bir yontemdir.Kalitim ise daha onceden yazilmis bir sinifin,belli
bir problem icin yeni versiyonunu yazma isleminde,kalitim kavrami kullanilabilir.Fakat kalitim konusunda turetilen sinif ile tureyen sinif arasinda bir iliski olmalidir
Bu iliski "bir" iliskisidir.Ornegin Kaplan bir kedidir.Bu iki sýnýf arasýnda "bir" (-is a) iliskisi oldugundan,kalitim kavramini bu siniflar üzerinde rahatça kullanabiliriz */
public class Araba {

	Motor m = new Motor(); // Motor sinifini Araba'ya dahil ettik.(bagladik)
	
	public void Calistirma() {
		m.calis();
		System.out.println("Arabamiz calisti");
	}
	
	public void Durdurma() {
		m.dur();
		System.out.println("Arabamiz durdu");
		
	}
	
	public static void main(String[] args) {
		
		Araba a = new Araba();
		a.Calistirma();
		a.Durdurma();
		
	}
}
	// Cýkan sonuclara bakildiginda arabanýn motor ozeligini kullanýyoruz fakat araba bagýmsýz bir þeklide motorsuzda olabilirdi yani ben motor ozelligini icine dahil ederek kompozisyonu kullandim 
	/* -- CALISMA SONUCLARI
	Ben uretilmis bir motorum
	Motor calisiyor
	Arabamiz calisti
	Motor durdu
	Arabamiz durdu*/

