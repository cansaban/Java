package unite9soru6;

import java.io.File;
import java.io.IOException;
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

public class dosyadanBelirtilenSil {

	public static void main(String[] args) throws IOException{
		String ayirac = File.separator;

		Scanner scn = new Scanner(System.in);
		System.out.print("Hangi klasorun icine textleri yerlestireyim?Lutfen klasor ismi yaziniz:");
		String str= scn.next();
		
		
		for (int i = 0 ; i < 10 ; i++ ) {  
			String s=String.valueOf(i);
			File dosya = new File(ayirac+str,"test"+s+".txt");
			boolean olustumu = dosya.createNewFile();
			System.out.print("Test"+s+".txt'si olusturuldu:"+olustumu+"- - -");
		}
		
		Listeliyici list = new Listeliyici();
		list.listele(ayirac+str);
		
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println("\nHangi dosyayi sileyim?Silmeyi durdurmak istiyorsanýz 'Durdur' yaziniz");
		String str1= scn1.next();
			
		File dosya1 = new File(ayirac+str,str1);
		boolean sil = dosya1.delete();
		System.out.print(dosya1+"silindi:"+sil);
			
		list.listele(ayirac+str);
		
		
		scn.close();
		scn1.close();
		
		

	}

}




