package unite10soru2;

import java.nio.DoubleBuffer;

public class BagilOperasyonDoubleBufferPozisyonArtis {

	public static void ekranaBastir(int capacity , int limit , int position) {
		
		System.out.println(" Kapasite : " + capacity);
		System.out.println(" Limit : " + limit);
		System.out.println(" Pozisyon : " + position);
		System.out.println(" - - - - - - - - - - - - - - ");
		
	}
	
	public static void main(String[] args) {
		
		DoubleBuffer dbbfr = DoubleBuffer.allocate(20);
		int kapasite = dbbfr.capacity();
		int limit = dbbfr.limit();
		int pozisyon = dbbfr.position();
		ekranaBastir(kapasite, limit, pozisyon);
		
		dbbfr.put(5.1);
		dbbfr.put(5.2);
		dbbfr.put(5.3);
		dbbfr.put(5.4);
		dbbfr.put(5.5);
		dbbfr.put(5.6);
		
		kapasite = dbbfr.capacity();
		limit = dbbfr.limit();
		pozisyon = dbbfr.position();
		ekranaBastir(kapasite, limit, pozisyon);
		
		dbbfr.flip();
		
		while (dbbfr.hasRemaining()) {
			
			System.out.println("-->" +dbbfr.get());
			
		}
		
		System.out.println("- - - - - While sonu - - - - - -- ");
		kapasite = dbbfr.capacity();
		limit = dbbfr.limit();
		pozisyon = dbbfr.position();
		ekranaBastir(kapasite, limit, pozisyon);

	}

}
