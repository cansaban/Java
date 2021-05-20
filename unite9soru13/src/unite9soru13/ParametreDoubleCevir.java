package unite9soru13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParametreDoubleCevir {

	public static void mesaj() {
		System.out.print("Double'a cevirelim.Giris yapiniz:");
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		mesaj();
		
		
		
		try {
			String str = bf.readLine();
			double d = Double.parseDouble(str);
			System.out.println("Cevirilen Double = " + d);
		} catch (Exception e) {
			System.out.println("Hata olustu : - - >" + e);
		}finally {
			System.out.println("Program sonlandi");
		}

	}

}
