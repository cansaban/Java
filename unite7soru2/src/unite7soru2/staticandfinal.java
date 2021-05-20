package unite7soru2;

interface SandF{
	int a = 1;
	String b = "StaticAndFinal";
	double c = 67.7;
	int d = (int) (Math.random() * 10);
	
}

public class staticandfinal implements SandF {

	
	public static void main(String[] args) {

		System.out.println("a sayýsý = " + a);
		// a = 2; - - - > Hata!! The final field SandF.a cannot be assigned (Final a alanýnýna deger atanamaz diyor final "son" anlamýna geldiði için deðiþtirilemezliði simgeler)
		System.out.println("b String'i = "+b);
		//b= "Static"; - - - > Hata!! The final field SandF.b cannot be assigned (Final b alanýnýna deger atanamaz diyor final "son" anlamýna geldiði için deðiþtirilemezliði simgeler) 
		System.out.println("d Sayýsý = " +d);
		//d = 11; - - - > Hata!! The final field SandF.b cannot be assigned (Final b alanýnýna deger atanamaz diyor final "son" anlamýna geldiði için deðiþtirilemezliði simgeler)
		
		// Static olmasýný da aciklarsak degiskenleri nesne oluþturmadan yazdirabiliyoruz eger statik ozellikleri olmasaydý bunu yapamazdýk
		// Yani new staticandfinal().a; seklinde yazdýrtmak gerekirdi
		//Statik alanlar,bir sýnýfa ait olan alanlardýr be bu sýnýfa ait tüm nesneler için ortak alanda bulunurlar,ayrýca statik alanlara sadece bir kez ilk degerleri atanýr.
		//
		
	}

}