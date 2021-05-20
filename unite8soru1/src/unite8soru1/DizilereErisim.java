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

/* DizilereErisim.java uygulamamýzda istisna olusma riski var.Eger tasarimci dizinin olmayan bir elemanýna erismeye kalkarsa ArrayIndexOutOfBoundsException
 * hatasý alacaktýr,yani RuntimeException hatasý , bunun sebebi tasarýmcý dikkatsizligidir.Boyle hatalar derleme anýnda anlasilamazlar.Java bu tür hatalar için
 * önceden önlem alma sartini kosmaz.Ama onlem almak özgürlügüne sahibiz.Ancak örnegin bir dosyaya erismeye çalýþýlýrken ortaya çýkacak istisnaya önlem almak gerekir.Çünkü bu tür hatalar
 * Exception istisna tipine girer.  */
