package unite7soru6;

class Hesaplama2{
	private class Toplama2{
		public int toplamaYap (int a, int b) {
			return a + b;
		}
	}
	
	protected class Cikartma2 {
		public int cikartmaYap (int a, int b) {
			return a - b;
		}
	}
	
	class Carpma2 {
		public int carpmaYap(int a , int b) {
			return a * b; 
		}
	}
	
	private class Bolme2 {
		public int bolmeYap(int a , int b) {
			return a / b;
		}
	}
} // class Hesaplama2

public class Hesaplama2Kullan {

	public static void main(String[] args) {
		
		//Hesaplama2.Toplama2 ht = new Hesaplama2().new Toplama2(); Hata , D�� class'tan private  class'a eri�ilemez
		Hesaplama2.Cikartma2 hck = new Hesaplama2().new Cikartma2();
		Hesaplama2.Carpma2 hcp = new Hesaplama2().new Carpma2();
		//Hesaplama2.Bolme2 hb = new Hesaplama2().new Bolme2(); Hata , D�� class'tan private class'a eri�ilemez
		
		//Hata //int sonuc1 = ht.toplamaYap(10,5); Hata , D�� class'tan private class'ta olan inner class'a eri�ilemez
		int sonuc2 = hck.cikartmaYap(10, 5);
		int sonuc3 = hcp.carpmaYap(10, 5);
		//Hata //int sonuc4 = hb.BolmeYap(10,5); Hata , D�� class'tan private class'ta olan inner class'a eri�ilemez
		System.out.println("Cikartma sonuc = "+ sonuc2);
		System.out.println("Carpma sonuc = " + sonuc3);
	}

}
