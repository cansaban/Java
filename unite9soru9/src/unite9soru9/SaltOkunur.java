package unite9soru9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Listeliyici {
	public void listele (String dizin) {
		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list();
		for (int i = 0 ; i<dosyaListesi.length ; i++) {
			System.out.print("\n"+dosyaListesi[i]);
		}
	}
}
public class SaltOkunur {
	public static void main(String[] args) throws IOException{
		String ayirac = File.separator;

		Scanner scn = new Scanner(System.in);
		System.out.print("Hangi klasorun icine dosyalari gostereyim?Lutfen klasor ismi yaziniz:");
		String str= scn.next();
		
		
		
		Listeliyici list = new Listeliyici();
		list.listele(ayirac+str);
		
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println("\nHangi dosyayi salt okunur(read only) hale getireyim?");
		String str1= scn1.next();
			
		File dosya1 = new File(ayirac+str,str1);
		boolean saltOkunur = dosya1.setReadOnly();
		System.out.print(dosya1+" salt okunur:"+saltOkunur);
		
		try {
			// SALT OKUNUR OLD ICIN HATA VERÝR VE CATCH'E GIDER Salt okunurluk dosyaya yazmaya izin vermez eriþim engeli hatasý verir
			PrintWriter yazici = new PrintWriter(new FileWriter(dosya1));
			yazici.println("Merhabalar");
			yazici.close();
		} catch (IOException e) {
			System.err.println("Hata olustu"+e);
		}
			
		scn.close();
		scn1.close();

	}

}



