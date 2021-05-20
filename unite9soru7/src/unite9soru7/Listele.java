package unite9soru7;

import java.io.File;
import java.util.Scanner;



public class Listele {

	public void listele (String dizin) {
		File dosyalar = new File(dizin);
		String[] dosyaListesi = dosyalar.list();
		for (int i = 0 ; i<dosyaListesi.length ; i++) {
			System.out.print("\n"+dosyaListesi[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Dizin ismi girin listeleyelim:");
		String str = scn.next();
		
		Listele list = new Listele();
		list.listele(str);
		scn.close();
		

	}

}
