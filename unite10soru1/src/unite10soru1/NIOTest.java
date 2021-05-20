package unite10soru1;

import java.nio.ByteBuffer;

public class NIOTest {

	public static void main(String[] args) {
		
		ByteBuffer bb = ByteBuffer.allocate(12); // 4 byte + 1 double = 12 bayt eder. 
		
		bb.put((byte) 'a');
		bb.put((byte) 'b');
		bb.put((byte) 'c');
		bb.put((byte) 'd');
		
		bb.putDouble(5.1);
		
		int kapasite = bb.capacity();
		int limit = bb.limit();
		int pozisyon = bb.position();
		
		System.out.println(" Kapasite: " +kapasite);
		System.out.println(" limit: " +limit);
		System.out.println(" pozisyon " +pozisyon);
		
		/*
		    Kapasite: 12
 			limit: 12
 			pozisyon 12 seklinde çýkar
		 */
				
				

	}

}
