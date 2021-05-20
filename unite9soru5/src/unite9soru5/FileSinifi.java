package unite9soru5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Listeliyici {
	public void listele (String dizin) {
		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list();
		for (int i = 0 ; i<dosyaListesi.length ; i++) {
			System.out.println(dosyaListesi[i]);
		}
	}
}

public class FileSinifi {

	public static void main (String[] args) throws IOException {
		String ayirac = File.separator;

		Scanner scn = new Scanner(System.in);
		System.out.print("Hangi klasorun icine textleri yerlestireyim?Lutfen klasor ismi yaziniz:");
		String str= scn.next();
		
		
		for (int i = 0 ; i < 10 ; i++ ) {  
			String s=String.valueOf(i);
			File dosya = new File(ayirac+str,"test"+s+".txt");
			boolean olustumu = dosya.createNewFile();
			System.out.print("Test"+s+".txt'si olusturuldu:"+olustumu+"-");
		}
		
		for (int i = 0 ; i < 10 ; i++ ) {  
			String s=String.valueOf(i);
			File dosya1 = new File(ayirac+str,"test"+s+".txt");
			boolean silindiMi =dosya1.delete();
			System.out.print("Test"+s+".txt'si silindi:"+silindiMi+"-");
		} 
		
		scn.close();
		
		
		
		
	/*	String ayirac = File.separator;
		File dosya = File.createTempFile("test","txt", new File(ayirac+"temp"));
		dosya.deleteOnExit();
		PrintWriter yazici = new PrintWriter(new FileWriter(dosya));
		yazici.println("test.txt'si");
		yazici.close();   */ 
	}

}
