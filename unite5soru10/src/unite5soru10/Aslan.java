package unite5soru10;
/*Kompozisyon daha onceden yazilmis siniflarin ozelliklerini kullanmak için temiz bir yontemdir.Kalitim ise daha onceden yazilmis bir sinifin,belli
bir problem icin yeni versiyonunu yazma isleminde,kalitim kavrami kullanilabilir.Fakat kalitim konusunda turetilen sinif ile tureyen sinif arasinda bir iliski olmalidir
Bu iliski "bir" iliskisidir.Ornegin Kaplan bir kedidir.Bu iki sýnýf arasýnda "bir" (-is a) iliskisi oldugundan,kalitim kavramini bu siniflar üzerinde rahatça kullanabiliriz */

class Memeliler {
	 Memeliler() {
		System.out.println("Memeliler Constructor'ý(Yapilandiricisi)");
	}	
}
class Kedigiller extends Memeliler {
	 Kedigiller() {
		System.out.println("Kedigiller Constructor'ý(Yapilandiricisi)");
	}
}

class Aslan extends Kedigiller {
	  Aslan() {
		System.out.println("Aslan Constructor'ý(Yapilandiricisi)");
	}
	  public static void main(String[] args) {
			Aslan a = new Aslan();

		}
}
// burada bakildiginda bir iliþki var (-is a) iliþkisi cunku aslan bir kedigilir ve kedigilde bir memelidir.Goruldugu gibi turetilen ile tureyen arasýnda bir iliþki vardýr.  
/* - - Sonuclar - -
Memeliler Constructor'ý(Yapilandiricisi)
Kedigiller Constructor'ý(Yapilandiricisi)
Aslan Constructor'ý(Yapilandiricisi)
*/


