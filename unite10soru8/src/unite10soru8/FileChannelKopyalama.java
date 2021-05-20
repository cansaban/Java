package unite10soru8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class FileChannelKopyalama {

	private static String[] atxtDizisi = {
			"Merhaba","ben","a",".txt","yim","diger","txt'ye","kopyalandim"
	};
	
	private FileChannel oku;
	private FileChannel yaz;
	
	public FileChannelKopyalama(String kaynakDosya, String hedefDosya) throws Exception {
		
		oku = new FileInputStream(kaynakDosya).getChannel();
		yaz  = new FileOutputStream(hedefDosya).getChannel();
		
		yaz.transferFrom(oku, 0, oku.size());
		
		oku.close();
		yaz.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File yeniDosya = new File("a.txt");
		yeniDosya.createNewFile();
		FileWriter fw = new FileWriter(yeniDosya);
		PrintWriter pw = new PrintWriter(fw);
		
		for (int i = 0 ; i < atxtDizisi.length ; i++) {
			pw.print(atxtDizisi[i]);
			pw.print(' ');
		}
		pw.close();
		
		try {
			System.out.println("Kopyasý alýnacak txt giriniz");
			Scanner s = new Scanner(System.in);
			String str = s.next();
			System.out.println("Kopya alýndý simdi yaziacak txt giriniz");
			Scanner s1 = new Scanner(System.in);
			String str1 = s1.next();
			
			new FileChannelKopyalama(str, str1);
			
			s.close();
			s1.close();
			
		} catch (Exception e) {
			System.err.println("Kopyasý alýnacak txt mevcut dizininizde yok");
			e.printStackTrace();
		}
		

	}

}
