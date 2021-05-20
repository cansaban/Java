package unite9soru3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnegi {
	
	

	private void SatirSatirOku(String a) throws IOException{
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(a);
			br = new BufferedReader(fr);
			
			if ( !br.ready()) {
				throw new IOException("Henuz okunmaya hazir degil! ");
			}
			
			int toplamSatirSonu = 0;
			
			while ( (br.readLine() ) != null ) {
				toplamSatirSonu++;
			}
			
			System.out.println("toplamSatirSonu:"+toplamSatirSonu);
			
		} catch (IOException e) {
			System.err.println("Hata olustu:" + e);
		}finally {
			br.close();
		}
		

	}
	
	public static void main(String[] args) throws IOException{
		try {
			if (args.length != 1) {
				System.err.println("Dosya ismi eksik!!");
				System.exit(1);
			}
			
			BufferedReaderOrnegi bro = new BufferedReaderOrnegi();
			String str = args[0].trim();
			bro.SatirSatirOku(str);
			
		} catch (RuntimeException e) {
			System.err.println("Hata olustu:" + e);
		}
		
		
		

		
	}

}
