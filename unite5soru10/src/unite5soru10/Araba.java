package unite5soru10;
/*Kompozisyon daha onceden yazilmis siniflarin ozelliklerini kullanmak i�in temiz bir yontemdir.Kalitim ise daha onceden yazilmis bir sinifin,belli
bir problem icin yeni versiyonunu yazma isleminde,kalitim kavrami kullanilabilir.Fakat kalitim konusunda turetilen sinif ile tureyen sinif arasinda bir iliski olmalidir
Bu iliski "bir" iliskisidir.Ornegin Kaplan bir kedidir.Bu iki s�n�f aras�nda "bir" (-is a) iliskisi oldugundan,kalitim kavramini bu siniflar �zerinde rahat�a kullanabiliriz */
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
	// C�kan sonuclara bakildiginda araban�n motor ozeligini kullan�yoruz fakat araba bag�ms�z bir �eklide motorsuzda olabilirdi yani ben motor ozelligini icine dahil ederek kompozisyonu kullandim 
	/* -- CALISMA SONUCLARI
	Ben uretilmis bir motorum
	Motor calisiyor
	Arabamiz calisti
	Motor durdu
	Arabamiz durdu*/

