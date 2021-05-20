package unite10soru3;


import java.nio.LongBuffer;

public class MutlakOperasyonLongBuffer {

public static void ekranaBastir(int capacity , int limit , int position) {
		
		System.out.println(" Kapasite : " + capacity);
		System.out.println(" Limit : " + limit);
		System.out.println(" Pozisyon : " + position);
		System.out.println(" - - - - - - - - - - - - - - ");
		
	}
	
	public static void main(String[] args) {
		LongBuffer lbfr = LongBuffer.allocate(6);
		
		int kapasite = lbfr.capacity();
		int limit = lbfr.limit();
		int pozisyon = lbfr.position();
		ekranaBastir(kapasite, limit, pozisyon);
		
		lbfr.put(0, 5);
		lbfr.put(1 ,6);
		lbfr.put(2 ,7);
		lbfr.put(3 ,8);
		lbfr.put(4, 9);
		
		
		kapasite = lbfr.capacity();
		limit = lbfr.limit();
		pozisyon = lbfr.position();
		ekranaBastir(kapasite, limit, pozisyon);
		
	
		
		for (int i = 0 ; i< lbfr.limit() ; i++) {
			System.out.println("- - -> " +lbfr.get(i));
		}
		
		System.out.println("- - - - - For sonu - - - - - -- ");
		
		kapasite = lbfr.capacity();
		limit = lbfr.limit();
		pozisyon = lbfr.position();
		
		ekranaBastir(kapasite, limit, pozisyon);

	}

}
