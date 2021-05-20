package unite7soru9;


public class Hesapla {
	
	public static int topla(int a , final int b,final int c) {
		int a_yedek = a;
		
		class topla2 {
		private int x ;
		public int y;
		protected int z = a_yedek;
		int p;
			public int degerDondur() {
				int degera= a_yedek;
				int degerb= b;
				int degerc= c;
				return degera+degerb+degerc;
			}
		}
		topla2 t2 = new topla2();
		return t2.degerDondur();
		
	}
	public static void main(String[] args) {
	
		int sonuc = Hesapla.topla(1, 2, 4);
		System.out.println("Sonuc = "+ sonuc);
	
	}

}
