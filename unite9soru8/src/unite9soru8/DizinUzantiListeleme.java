package unite9soru8;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

class Filtre implements FilenameFilter {
	
	private String dosyaUzanti;
	public Filtre(String uzanti) {
		
		if(uzanti.startsWith("."))
			dosyaUzanti = uzanti;
		else 
			dosyaUzanti = "." + uzanti;
	}
	
	public boolean accept(File dizin , String dosyaIsmi) {
		if(dosyaIsmi.endsWith(dosyaUzanti))
			return true;
		else
			return false;
	}
}

public class DizinUzantiListeleme {

	public void listele(String dizin , String uzanti) {
		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list(new Filtre(uzanti));
		for (int i = 0 ; i<dosyaListesi.length ; i++) {
			System.out.println(dosyaListesi[i]);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Dizin yolunu giriniz");
		String str = s.next();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Dizindeki gostermek istediginiz uzanti adini giriniz");
		String str1 = s1.next();
		DizinUzantiListeleme dul = new DizinUzantiListeleme();
		dul.listele(str, str1);
		s.close();
		s1.close();
	}

}
