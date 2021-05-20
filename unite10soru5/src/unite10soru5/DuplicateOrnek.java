package unite10soru5;

import java.nio.Buffer;
import java.nio.DoubleBuffer;

public class DuplicateOrnek {

	private static DoubleBuffer db;
	private static double[] Dizi = new double [5];
	
	public static void ekranaBas (Buffer b){
		
		System.out.println("kapasite : " +b.capacity());
		System.out.println("limit: " +b.limit());
		System.out.println("pozisyon: "+b.position());
		System.out.println("- - - - - - - - - - - - - ");
		
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 0 ; i < 5 ; i++) {
			double d = 1.2;
			Dizi[i] = d + i;
		}
		
		db = DoubleBuffer.wrap(Dizi);
		ekranaBas(db);
		DoubleBuffer db2 =db.duplicate();
		ekranaBas(db2);
		
		db.put(2, 8.9);
		db2.put(4, 9.1);
		db.position(4);
		db2.position(2);
		
		ekranaBas(db);
		ekranaBas(db2);
		
		for ( int i = 0 ; i < db.capacity() ; i++) {
			System.out.println("-->"+db.get(i));
		}
		
		System.out.println("- - - - - - - -- - - - - -");
		
		for ( int i = 0 ; i < db2.capacity() ; i++) {
			System.out.println("-->"+db2.get(i));
		}

	}

}
