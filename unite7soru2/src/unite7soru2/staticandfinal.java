package unite7soru2;

interface SandF{
	int a = 1;
	String b = "StaticAndFinal";
	double c = 67.7;
	int d = (int) (Math.random() * 10);
	
}

public class staticandfinal implements SandF {

	
	public static void main(String[] args) {

		System.out.println("a say�s� = " + a);
		// a = 2; - - - > Hata!! The final field SandF.a cannot be assigned (Final a alan�n�na deger atanamaz diyor final "son" anlam�na geldi�i i�in de�i�tirilemezli�i simgeler)
		System.out.println("b String'i = "+b);
		//b= "Static"; - - - > Hata!! The final field SandF.b cannot be assigned (Final b alan�n�na deger atanamaz diyor final "son" anlam�na geldi�i i�in de�i�tirilemezli�i simgeler) 
		System.out.println("d Say�s� = " +d);
		//d = 11; - - - > Hata!! The final field SandF.b cannot be assigned (Final b alan�n�na deger atanamaz diyor final "son" anlam�na geldi�i i�in de�i�tirilemezli�i simgeler)
		
		// Static olmas�n� da aciklarsak degiskenleri nesne olu�turmadan yazdirabiliyoruz eger statik ozellikleri olmasayd� bunu yapamazd�k
		// Yani new staticandfinal().a; seklinde yazd�rtmak gerekirdi
		//Statik alanlar,bir s�n�fa ait olan alanlard�r be bu s�n�fa ait t�m nesneler i�in ortak alanda bulunurlar,ayr�ca statik alanlara sadece bir kez ilk degerleri atan�r.
		//
		
	}

}