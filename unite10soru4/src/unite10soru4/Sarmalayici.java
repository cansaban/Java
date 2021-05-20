package unite10soru4;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Sarmalayici {

	public static int [] dizi  = new int[22];
	
	public static void main(String[] args) {
	
		
		for (int i = 0 ; i < 20 ; i++) {
			dizi[i] = i;
		}
		
		IntBuffer ib = IntBuffer.wrap(dizi);
		
		while (ib.hasRemaining()) {
			
			System.out.println("- - ->" +ib.get());
			
		}

		System.out.println(" - - - - - - -- - - - -");
		
		for (int i  = 0 ; i < ib.limit() ; i++) {
			System.out.println("- - ->" +ib.get(i));
		}
	}

}
