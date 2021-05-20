package unite9soru10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RastgeleOkuYaz {

	public static void main(String[] args) throws IOException {
		
		String ayirac = File.separator;
		
		File yeniDosya = File.createTempFile("test", ".txt", new File(ayirac+"temp"));
		yeniDosya.deleteOnExit(); //Bunu silmezseniz yazýlanlar dizinde .txt seklinde olusacaktir.
		
		PrintWriter yazici = new PrintWriter(new FileWriter(yeniDosya));
		
		Random r = new Random();
		
		for (int i = 0 ; i < 1000 ; i++) {
			int sayi = r.nextInt(15000);
			yazici.print(sayi);
			yazici.print("-");
		}
		yazici.close();
		
		BufferedReader okuyucu = new BufferedReader(new FileReader(yeniDosya));
		String okunan = okuyucu.readLine();
		while(okunan != null) {
			System.out.println(okunan);
			okunan = okuyucu.readLine();
		}
		okuyucu.close();
		
		
		

	}

}
