package unite8soru4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Istisna {

	public void cokHesapla() {
		try {
			
			File file = new File("file.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			System.out.println(bfr.readLine());
			
		} catch (IOException ioe) {
			System.out.println("Hata Yakalandi  - cokHesapla()" +ioe);
		}
	
		
	}
	
	public void hesapla() {
		cokHesapla();
		System.out.println("hesapla() yordami");
	}
	
	
	public static void main(String[] args){
		Istisna ist = new Istisna();
		ist.hesapla();
		System.out.println("main() yordami ");

	}

}
