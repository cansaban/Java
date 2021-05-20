package unite10soru7;

import java.nio.ByteBuffer;

public class DogrusalOlmayanTampon {
	
	private ByteBuffer bf; //Dogrusal ve Dogrusal olmayan tamponlar sadece ByteBuffer sýnýfýna ait olan bir özelliktir.
	
public void basla() {
		
		bf = ByteBuffer.allocate(7);
		
		boolean DogrusalMi = bf.isDirect();
		
		if (!DogrusalMi) {
		
			bf.put( (byte) 'a' );
			bf.put( (byte) 'b' );
			bf.put( (byte) 'c' );
			bf.put( (byte) 'd' );
			bf.put( (byte) 'e' );
		
			System.out.println("Dogrusal mi? : "+DogrusalMi);
			
			System.out.println("- - - - - - - - -- ");
			
			boolean ArkaDizisiVarMi = bf.hasArray();
			System.out.println("Arka Dizisi Var Mi : " +ArkaDizisiVarMi);
			
			System.out.println("- - - - - - - - -- ");
			
			if(ArkaDizisiVarMi) {
				byte[] b = bf.array();
				for(int i = 0 ; i<b.length ; i++) {
					System.out.println("-->"+b[i]);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		DogrusalOlmayanTampon dt = new DogrusalOlmayanTampon();
		dt.basla();

	}

}
