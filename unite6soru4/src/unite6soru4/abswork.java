package unite6soru4;

abstract class Kedi {
	
	public abstract void avYakala(); // Soyut yordam
	
	public int kacAvYakaladik (int sayi) {
		System.out.println("Kedi avlar yakaladi");
		return sayi;
	}
	
}

class Kaplan extends Kedi {
	public void avYakala() {
		System.out.println("Kaplan avYakala() metodu");
		
	}
	public int kacAvYakaladik (int sayi) {
		System.out.println("Kaplan avlar yakaladi");
		return sayi;
	}
	
}
public class abswork {

	public static void basla(Kedi k[]) {
		for (int i = 0 ; i<k.length ; i++) {
			k[i].avYakala();
		}
	}
	
	public static void main(String[] args) {
		Kedi k[] = new Kedi[3];
		// k[0] = new Kedi(); Soyut sýnýflar new ile olusturulamazlar!!
			k[0] = new Kaplan();
			k[1] = new Kaplan();
			k[2] = new Kaplan();
			basla(k);
			System.out.println("- - - - - - - - - - - - - - -");
			int kacAvyakaladimOrnek = k[0].kacAvYakaladik(10);
			System.out.println(+kacAvyakaladimOrnek+" - - -> Ilk kaplan bu kadar yakaladi");
	}
	/*Bir sinifin soyut olmasi icin icerisinde an az bir adet soyut yordamin olmasi gerekir.Soyut yordamlarin govdesi bulunmaz;yani,ici bos hicbir
	 * is yapmayan yordam gorunumundedirler.Soyut bir siniftan turetilmis altsiniflar,bu soyut sinifin icerisindeki soyut yordamlari kesinkes iptal
	 * etmeleri gerekmektedir.Eger turetilmis altsiniflar,soyut olan ana siniflarina ait soyut yordamlari iptal etmezse derleme aninda hata ile karsilasilir
	 */

}
