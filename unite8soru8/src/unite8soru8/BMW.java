package unite8soru8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;




class Araba {
	public void motor (int degisken) throws IOException {
		System.out.println("Araba calisiyor " + degisken);
		
	}
}

public class BMW extends Araba {

		public void motor(int degisken) throws ArithmeticException,EOFException,FileNotFoundException {
			System.out.println("BMW calisiyor " + degisken);
			
			if (degisken == 0) {
				int i = 16 / 0 ;
				
			}
			else if (degisken == 1) {
				throw new FileNotFoundException("Dosya bulunamadi");
			}
			else if (degisken == 2) {
				throw new EOFException("Dosyanin sonuna geldik ");
			}

		}
		public static void calis(BMW b , int degisken) {
			try {
				b.motor(degisken);
			} catch (Exception ex) {
				System.out.println("Istisna olustu: " + ex);
			}
			finally {
				System.out.println("Finally blogu");
				System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
			}
			
		}

	public static void main(String[] args) {
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		BMW b3 = new BMW();
		
		Random r = new Random();
		int dizi[] = {r.nextInt(10) % 3 , r.nextInt(10) % 3 , r.nextInt(10) % 3};
		calis (b1,dizi[0]);
		calis (b2,dizi[1]);
		calis (b3,dizi[2]);

		

	}

}







