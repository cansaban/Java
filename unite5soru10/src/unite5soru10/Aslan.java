package unite5soru10;
/*Kompozisyon daha onceden yazilmis siniflarin ozelliklerini kullanmak i�in temiz bir yontemdir.Kalitim ise daha onceden yazilmis bir sinifin,belli
bir problem icin yeni versiyonunu yazma isleminde,kalitim kavrami kullanilabilir.Fakat kalitim konusunda turetilen sinif ile tureyen sinif arasinda bir iliski olmalidir
Bu iliski "bir" iliskisidir.Ornegin Kaplan bir kedidir.Bu iki s�n�f aras�nda "bir" (-is a) iliskisi oldugundan,kalitim kavramini bu siniflar �zerinde rahat�a kullanabiliriz */

class Memeliler {
	 Memeliler() {
		System.out.println("Memeliler Constructor'�(Yapilandiricisi)");
	}	
}
class Kedigiller extends Memeliler {
	 Kedigiller() {
		System.out.println("Kedigiller Constructor'�(Yapilandiricisi)");
	}
}

class Aslan extends Kedigiller {
	  Aslan() {
		System.out.println("Aslan Constructor'�(Yapilandiricisi)");
	}
	  public static void main(String[] args) {
			Aslan a = new Aslan();

		}
}
// burada bakildiginda bir ili�ki var (-is a) ili�kisi cunku aslan bir kedigilir ve kedigilde bir memelidir.Goruldugu gibi turetilen ile tureyen aras�nda bir ili�ki vard�r.  
/* - - Sonuclar - -
Memeliler Constructor'�(Yapilandiricisi)
Kedigiller Constructor'�(Yapilandiricisi)
Aslan Constructor'�(Yapilandiricisi)
*/


