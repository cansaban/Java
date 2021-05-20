package unite8soru10;

/* Bir yordam�n bir seferde yazn�zca tek �ey d�nd�rme hakk� vard�r.Ya bir deger dondurebilir veya bir istisna uretebilir;sonu�ta uretilen bir istisna da deger niteligi
   tas�r.Bu uygulamada calis() yordami int deger dondurecegini soyledigi ve finally blogu kullanildigi icin istisnan�n yeniden uretilmesi olanaksizdir.Bu i�e cozum bulmakt�r kodumuzun amaci.
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
