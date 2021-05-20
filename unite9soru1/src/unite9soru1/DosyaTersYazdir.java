package unite9soru1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DosyaTersYazdir {

	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.err.println("Dosya ismi eksik !" );
			System.exit(1);
		}
		
		try {
			
			InputStream is = new FileInputStream(args [0]);
			byte [] bDizi = new byte [100];
			int okunanByteSayisi;
			
			
			while ( (okunanByteSayisi = is.read(bDizi)) != -1 ) {
				for (int i = 0 ; i < okunanByteSayisi ; i++) {
					System.out.print((char)bDizi[okunanByteSayisi-i-1]);
					
				}
			}
			
			is.close();
			
		} catch (IOException e) {
			System.err.println(e);
		} 
		
		
 
	} 
		

}
