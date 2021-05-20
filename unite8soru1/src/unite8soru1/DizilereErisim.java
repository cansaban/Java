package unite8soru1;

public class DizilereErisim {

	public void calis1() throws ArrayIndexOutOfBoundsException {
		int sayilar [] = {1,2,3,4,5};
		for (int i = 0 ; i < 6 ; i++) {
			System.out.println("- - - > " + sayilar[i]);
		}
		System.out.println("calis1() yordami");
	}
	
	public void calis2() throws ArrayIndexOutOfBoundsException {
		calis1();
		System.out.println("Calis1() yordami");
		
	}
	
	public void calis() throws ArrayIndexOutOfBoundsException {
	
		calis2();
		System.out.println("Calis2() yordami");
		
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			DizilereErisim de = new DizilereErisim();
			de.calis();
			System.out.println("main() yordami");
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Hata Yakalandi - main () = " +ex);
		}

	}

}

/* DizilereErisim.java uygulamam�zda istisna olusma riski var.Eger tasarimci dizinin olmayan bir eleman�na erismeye kalkarsa ArrayIndexOutOfBoundsException
 * hatas� alacakt�r,yani RuntimeException hatas� , bunun sebebi tasar�mc� dikkatsizligidir.Boyle hatalar derleme an�nda anlasilamazlar.Java bu t�r hatalar i�in
 * �nceden �nlem alma sartini kosmaz.Ama onlem almak �zg�rl�g�ne sahibiz.Ancak �rnegin bir dosyaya erismeye �al���l�rken ortaya ��kacak istisnaya �nlem almak gerekir.��nk� bu t�r hatalar
 * Exception istisna tipine girer.  */
