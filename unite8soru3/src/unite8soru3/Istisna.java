package unite8soru3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Istisna {

	public void cokHesapla() throws IOException {
		File file = new File("file.txt");
		BufferedReader bfr = new BufferedReader(new FileReader(file));
		System.out.println(bfr.readLine());
		
	}
	
	public void hesapla() throws IOException {
		cokHesapla();
		System.out.println("hesapla() yordami");
	}
	
	
	public static void main(String[] args) throws IOException {
		Istisna ist = new Istisna();
		ist.hesapla();
		System.out.println("main() yordami ");

	}

}
