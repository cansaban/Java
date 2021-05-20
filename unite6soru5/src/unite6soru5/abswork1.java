package unite6soru5;

abstract class Tirtil{
	abstract void kanatCirp();
	
	int beslen() {
		System.out.println("Tirtil beslenyor");
		return 1;
	}
}

class Kelebek extends Tirtil {
	public void kanatCirp(){
		System.out.println("Kelebek kanat cirpiyor");
		
	}
	
}


public class abswork1 {

	public static void main(String[] args) {
		
		//Tirtil t = new Tirtil();  soyut siniflar dogrudan new ile olusturulamazlar
		Tirtil t [] = new Tirtil [2];
		t[0] = new Kelebek();
		t[1] = new Kelebek();
		
		int a=t[0].beslen();
		t[1].kanatCirp();
		System.out.println("Beslen = "+a);
		
		
		/*Tirtil sinifindan tureyen siniflar tarafýndan bu yordam kesin kes iptal edilmelidir.Eger bir sinif icerisinde soyut bir yordam varsa o zaman 
		 * bu sinifta soyut(abstract) olmak zorundadir.Soyut siniflarin icerisinde normal yordamlarda bulunabilir(beslen() yordami gibi).Eðer ana sinifin icerisindeki
		 * bir yordamin turemis siniflar icerisinde iptal edilmeleri sansa birakilmak istenmiyorsa,o zaman bu yordamin soyut olarak tanimlanmasi gerekir. 
		 */

	}

}
