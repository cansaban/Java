/*package unite6soru9;

class Takim{
	public String pozisyon = "Takim";
	public void oyna() {
		System.out.println("Takim oynuyor");
	}
}

class Forvet{
	//public String pozisyon = "Forvet";
	public Forvet() {
	String pozisyon = "Forvet";
	}
	
	public void oyna() {
		System.out.println("Forvet oynuyor");
	}
	
}

class OrtaSaha{
	
	public OrtaSaha() {
		String pozisyon = "Orta Saha";
	}
	
	public void oyna() {
		System.out.println("Orta saha oynuyor");
	}
}

class Defans {
	public Defans() {
		String pozisyon = "Defans";
	}
	
	public void oyna() {
		System.out.println("Defans oynuyor");
	}
}

class Kaleci {
	public Kaleci() {
		String pozisyon = "Kaleci";
	}
	
	public void oyna() {
		System.out.println("Kaleci oynuyor");
	}
}

public class FutbolTakimi {

	public static void FutbolTakimiBasla(Object o []) {
		for (int i = 0 ; i<o.length ;i++) {
			if(o[i] instanceof Takim) {
				Takim t = (Takim) o[i];  - - - > Asagi cevrim
				t.oyna();
			}
			else if (o[i] instanceof Forvet) {
				Forvet f = (Forvet) o[i]; - - - > Asagi cevrim
				f.oyna();
			}
			else if (o[i] instanceof OrtaSaha) {
				OrtaSaha os = (OrtaSaha) o[i]; - - - > Asagi cevrim
				os.oyna();
			}
			else if (o[i] instanceof Defans) { 
				Defans d = (Defans) o[i]; - - - > Asagi cevrim
				d.oyna();
			}
			else if (o[i] instanceof Kaleci) {
				Kaleci k = (Kaleci) o[i]; - - - > Asagi cevrim
				k.oyna();
			}
		}
	}
	
	public static void main(String[] args) {
		Object obj [] = new Object[5];
			obj[0] = new Takim();
			obj[1] = new OrtaSaha();
			obj[2] = new Defans();
			obj[3] = new Kaleci();
			obj[4] = new Forvet();
			FutbolTakimiBasla(obj);
	}

}
*/
/* Yukaridaki kodlamada Nesneye Yonelik Programlama yakismayan tarzda yazilmistir.Her turetilen sýnýf için ayrý ayrý bir if else'ler yazmak gerektiriyor.
Fakat polimorfizm bizi bu dertten kurtarýr ve devreye girerek uzun yazimlardan kurtarir.
*/

package unite6soru9;

class Takim{
	public String pozisyon = "Takim";
	public void oyna() {
		System.out.println("Takim oynuyor");
	}
}

class Forvet extends Takim{
	//public String pozisyon = "Forvet";
	public Forvet() {
	String pozisyon = "Forvet";
	}
	
	public void oyna() {
		System.out.println("Forvet oynuyor");
	}
	
}

class OrtaSaha extends Takim{
	
	public OrtaSaha() {
		String pozisyon = "Orta Saha";
	}
	
	public void oyna() {
		System.out.println("Orta saha oynuyor");
	}
}

class Defans extends Takim {
	public Defans() {
		String pozisyon = "Defans";
	}
	
	public void oyna() {
		System.out.println("Defans oynuyor");
	}
}

class Kaleci extends Takim {
	public Kaleci() {
		String pozisyon = "Kaleci";
	}
	
	public void oyna() {
		System.out.println("Kaleci oynuyor");
	}
}

public class FutbolTakimi {

	public static void FutbolTakimiBasla(Takim t []) {
		for (int i = 0 ; i<t.length ;i++) {
			t[i].oyna();
		}
	}
	
	public static void main(String[] args) {
		Takim t [] = new Takim[5];
			t[0] = new Takim();
			t[1] = new OrtaSaha(); //Yukari cevrim
			t[2] = new Defans(); // Yukari cevrim
			t[3] = new Kaleci(); //Yukari cevrim
			t[4] = new Forvet(); //Yukari cevrim
			FutbolTakimiBasla(t); 
	}
	/*Goruldugu gibi asagi cevrimle saglanan type castinglere ihtiyac kalmadi ve FutbolTakimiBasla artik tek satir denebilir ve genisletmeleri polimorfizm ile
	 * rahatca yapmis olduk*/

}