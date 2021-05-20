package unite10soru6;

import java.nio.IntBuffer;

public class SaltOkunurBuffer {

	public static void main(String[] args) {
		
		IntBuffer ib = IntBuffer.allocate(10);
		
		for (int i = 5 ; i < 9 ; i++) {
			ib.put(i);
		}
		
		IntBuffer ibSaltOkunur = ib.asReadOnlyBuffer(); // salt okunur bir tampon olusturuldu ib ye benzer hatta aynýsý
		
		ib.put(18);
		
		// ibSaltOkunur.put(12.1); // hatadýr Salt okunur old. için ekleme yapýlamaz yazma iþlemine girdiði için
		
		ib.flip();
		ibSaltOkunur.flip();
		
		while (ib.hasRemaining()) {
			System.out.println("-->" +ib.get());
			
		}
		
		System.out.println("- - - - - - - - -");
		
		while (ibSaltOkunur.hasRemaining()) {
			System.out.println("-->"+ibSaltOkunur.get());
			
		}
		
	}

}
