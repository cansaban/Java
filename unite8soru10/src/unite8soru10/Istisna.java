package unite8soru10;

/* Bir yordamýn bir seferde yaznýzca tek þey döndürme hakký vardýr.Ya bir deger dondurebilir veya bir istisna uretebilir;sonuçta uretilen bir istisna da deger niteligi
   tasýr.Bu uygulamada calis() yordami int deger dondurecegini soyledigi ve finally blogu kullanildigi icin istisnanýn yeniden uretilmesi olanaksizdir.Bu iþe cozum bulmaktýr kodumuzun amaci.
 */

public class Istisna {

	public int calis(int a , int b) throws ArithmeticException {
		int sonuc = 0;
		ArithmeticException globalAex = null;
		try {
			sonuc = a / b ;
		} catch (ArithmeticException aex) {
			System.out.println("calis() istisnasi yakalandi");
			globalAex = aex; 
		}finally {
			System.out.println("sonuc: "+sonuc);
			if (globalAex != null) {
				throw globalAex;
			}
			System.out.println("- - - - - - - - - - -");
			return sonuc;
			
		}
	}
	
	public static void main(String[] args) {
		int a = 0 , b = 0;
				
		try {
			Istisna ist1 = new Istisna();
			a = ist1.calis(2, 1); 
			b = ist1.calis(2, 0);
		} catch (ArithmeticException e) {
			System.out.println("main() istisna yakalandi");
		}finally {
			System.out.println("a = " +a);
			System.out.println("b = " +b);
		}

	}

}
