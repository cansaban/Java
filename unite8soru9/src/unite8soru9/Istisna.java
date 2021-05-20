package unite8soru9;

public class Istisna {

	private String c;

	// Olusan bir istisna her zaman uretilmeyebilir 
	
	public void topla (int a , int b) throws Exception {
		int toplamSonuc = 0 ; /* Java da metod i�erisinde tan�mlad���m�z de�i�kenlere local de�i�ken diyebiliriz.
								Local de�i�kenleri metod i�erisinde kullan�yorsak ilk de�er vermek zorunday�z (initialize)
								De�er vermedi�imizde hata verecektir.*/
		int c = 0;
		try {
			toplamSonuc = a + b ;
			c = toplamSonuc / 0; 
			
		} catch (Exception ex) {
			System.out.println("topla() istisna yakalandi");
			throw ex;
		}finally {
			System.out.println("toplamSonuc: " + toplamSonuc );
			System.out.println("c: " +c );
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			Istisna ist1 = new Istisna();
			ist1.topla(1, 2);
			
		} catch (Exception e) {
			System.out.println("main() istisna yakalandi");
		}

	}

}
