package unite8soru7;

import java.util.Random;

public class SystemExit {

	public static void SistemCikisi(int deger) {
		
		try {
			System.out.println("Metoda gelen sayi = " +deger );
			
			if (deger % 2 == 0) {
				System.out.println("Deger cifttir - - - >" + deger);
				System.exit(-1);
			}
			else {
				System.out.println("Deger tektir - - - >" + deger);
			}
			
			System.out.println("SistemCikisi metodu bitti");
		} catch (Exception ex) {
			System.out.println("Catch blogu ici");
		}finally {
			System.out.println("finally blogu cagirildi");
			System.out.println("- - - - - - - - - - - - --");
		}
		
	}
	
	public static void main(String[] args) {
		int sayi = (int)(Math.random()*10);
		SistemCikisi(sayi);

	}

}
