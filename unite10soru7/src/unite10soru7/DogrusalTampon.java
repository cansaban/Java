package unite10soru7;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class DogrusalTampon {

	private ByteBuffer bf; //Dogrusal ve Dogrusal olmayan tamponlar sadece ByteBuffer sýnýfýna ait olan bir özelliktir.
	
	public void basla() {
		
		bf = ByteBuffer.allocateDirect(7);
		
		boolean DogrusalMi = bf.isDirect();
		
		if (DogrusalMi) {
		
			bf.put( (byte) 'a' );
			bf.put( (byte) 'b' );
			bf.put( (byte) 'c' );
			bf.put( (byte) 'd' );
			bf.put( (byte) 'e' );
			
			bf.flip();

			while (bf.hasRemaining()) {
				System.out.println("-->"+bf.get());
				
			}
			
			System.out.println("- - - - - - - - -- ");
			
			System.out.println("Dogrusal mi? : "+DogrusalMi);
			
			boolean ArkaDizisiVarMi = bf.hasArray();
			System.out.println("Arka Dizisi Var Mi : " +ArkaDizisiVarMi);
		}
	}
	
	public static void main(String[] args) {
		DogrusalTampon dto = new DogrusalTampon();
		dto.basla();

	}

}
